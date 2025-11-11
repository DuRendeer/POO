package menu;

import modelo.*;
import enums.*;
import excecoes.*;
import repositorio.*;
import servico.ProcessadorPedidos;
import java.util.Scanner;
import dados.JsonDatabase;


public class MenuPrincipal {
    private Scanner scanner;
    private ClienteRepositorio clienteRepo;
    private ProdutoRepositorio produtoRepo;
    private PedidoRepositorio pedidoRepo;
    private ProcessadorPedidos processador;
    private JsonDatabase jsonDb;


    public MenuPrincipal() {
    this.scanner = new Scanner(System.in);
    this.clienteRepo = new ClienteRepositorio();
    this.produtoRepo = new ProdutoRepositorio();
    this.pedidoRepo = new PedidoRepositorio();
    this.processador = new ProcessadorPedidos();
    this.jsonDb = new JsonDatabase();

    this.clienteRepo.carregarLista(jsonDb.carregar("clientes.json", Cliente[].class));
    this.produtoRepo.carregarLista(jsonDb.carregar("produtos.json", Produto[].class));
    this.pedidoRepo.carregarLista(jsonDb.carregar("pedidos.json", Pedido[].class));

}


    public void iniciar() {
        Thread threadProcessamento = new Thread(processador);
        threadProcessamento.start();

        boolean continuar = true;

        while (continuar) {
            exibirMenu();
            int opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarProduto();
                    break;
                case 3:
                    criarPedido();
                    break;
                case 4:
                    listarClientes();
                    break;
                case 5:
                    listarProdutos();
                    break;
                case 6:
                    listarPedidos();
                    break;
                case 0:
                    continuar = false;
                    processador.parar();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
        System.out.println("Sistema encerrado");
    }

    private void exibirMenu() {
        System.out.println("\n=== SISTEMA DE GESTÃO DE PEDIDOS ===");
        System.out.println("1. Cadastrar Cliente");
        System.out.println("2. Cadastrar Produto");
        System.out.println("3. Criar Pedido");
        System.out.println("4. Listar Clientes");
        System.out.println("5. Listar Produtos");
        System.out.println("6. Listar Pedidos");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private int lerOpcao() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void cadastrarCliente() {
        try {
            System.out.println("\n--- Cadastrar Cliente ---");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();

            int id = clienteRepo.gerarProximoId();
            Cliente cliente = new Cliente(id, nome, email);
            clienteRepo.adicionar(cliente);
            clienteRepo.salvar();


            System.out.println("Cliente cadastrado com sucesso! ID: " + id);
        } catch (EmailInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
    }

    private void cadastrarProduto() {
        try {
            System.out.println("\n--- Cadastrar Produto ---");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Preço: ");
            double preco = Double.parseDouble(scanner.nextLine());

            System.out.println("Categorias: 1-ALIMENTOS | 2-ELETRÔNICOS | 3-LIVROS");
            System.out.print("Categoria: ");
            int catOpcao = Integer.parseInt(scanner.nextLine());

            CategoriaProduto categoria = obterCategoria(catOpcao);
            if (categoria == null) {
                System.out.println("Categoria inválida!");
                return;
            }

            int id = produtoRepo.gerarProximoId();
            Produto produto = new Produto(id, nome, preco, categoria);
            produtoRepo.adicionar(produto);
            produtoRepo.salvar();


            System.out.println("Produto cadastrado com sucesso! ID: " + id);
        } catch (PrecoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro: valor numérico inválido!");
        }
    }

    private void criarPedido() {
        System.out.println("\n--- Criar Pedido ---");
        System.out.print("ID do Cliente: ");
        int clienteId = lerOpcao();

        Cliente cliente = clienteRepo.buscarPorId(clienteId);
        if (cliente == null) {
            System.out.println("Cliente não encontrado!");
            return;
        }

        int pedidoId = pedidoRepo.gerarProximoId();
        Pedido pedido = new Pedido(pedidoId, cliente);

        boolean adicionandoItens = true;
        while (adicionandoItens) {
            System.out.print("ID do Produto (0 para finalizar): ");
            int produtoId = lerOpcao();

            if (produtoId == 0) {
                adicionandoItens = false;
            } else {
                Produto produto = produtoRepo.buscarPorId(produtoId);
                if (produto == null) {
                    System.out.println("Produto não encontrado!");
                    continue;
                }

                System.out.print("Quantidade: ");
                int quantidade = lerOpcao();

                ItemPedido item = new ItemPedido(produto, quantidade);
                pedido.adicionarItem(item);
                System.out.println("Item adicionado!");
            }
        }

        if (pedido.getItens().isEmpty()) {
            System.out.println("Pedido não criado: nenhum item adicionado");
            return;
        }

        pedidoRepo.adicionar(pedido);
        pedidoRepo.salvar();

        processador.adicionarNaFila(pedido);
        System.out.println("Pedido criado com sucesso! ID: " + pedidoId);
    }

    private void listarClientes() {
        System.out.println("\n--- Lista de Clientes ---");
        for (Cliente cliente : clienteRepo.listarTodos()) {
            System.out.println(cliente);
        }
    }

    private void listarProdutos() {
        System.out.println("\n--- Lista de Produtos ---");
        for (Produto produto : produtoRepo.listarTodos()) {
            System.out.println(produto);
        }
    }

    private void listarPedidos() {
        System.out.println("\n--- Lista de Pedidos ---");
        for (Pedido pedido : pedidoRepo.listarTodos()) {
            System.out.println(pedido);
            for (ItemPedido item : pedido.getItens()) {
                System.out.println("  " + item);
            }
        }
    }

    private CategoriaProduto obterCategoria(int opcao) {
        switch (opcao) {
            case 1: return CategoriaProduto.ALIMENTOS;
            case 2: return CategoriaProduto.ELETRONICOS;
            case 3: return CategoriaProduto.LIVROS;
            default: return null;
        }
    }
}
