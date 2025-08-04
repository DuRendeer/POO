public class Main {
    public static void main(String[] args) {
        Departamento ti = new Departamento("Tecnologia da Informação");
        
        Funcionario func1 = new Funcionario("Pedro Henrique Moreira", ti);
        Funcionario func2 = new Funcionario("Jorlan", ti);
        Funcionario func3 = new Funcionario("Barbosa", ti);
        
        ti.adicionarFuncionario(func1);
        ti.adicionarFuncionario(func2);
        ti.adicionarFuncionario(func3);
        
        ti.exibirDepartamento();
        
        System.out.println("\nDetalhes dos funcionarios:");
        func1.exibirFuncionario();
        func2.exibirFuncionario();
        func3.exibirFuncionario();
        

        System.out.println("\nTESTANDO OUTRAS CLASSE");
        

        Livro livro = new Livro("Diario de um banana", "Greg", "9784935");
        livro.exibirDados();
        
        Aluno aluno = new Aluno("Ana Costa", "202001");
        aluno.adicionarNota(8.4f);
        aluno.adicionarNota(9.1f);
        aluno.adicionarNota(7.9f);
        aluno.exibirBoletim();
        
        Cliente cliente = new Cliente("Carlos Mendes");
        Prato prato1 = new Prato("Pizza Margherita", 35.90);
        Prato prato2 = new Prato("Refrigerante", 8.50);
        
        Pedido pedido = new Pedido(cliente);
        pedido.adicionarPrato(prato1);
        pedido.adicionarPrato(prato2);
        pedido.exibirPedido();
        
        System.out.println("TESTANDO CURSO");
        Curso curso = new Curso("Engenharia de Softw", "ENG001", 120);
        curso.exibirDados();
        
        System.out.println("TESTANDO HOTEL");
        Quarto quarto = new Quarto(205, "Suite", "Disponível");
        Hospede hospede = new Hospede("Roberto Santos", "98765432100");
        Reserva reserva = new Reserva(quarto, hospede, "10/01/2025", "15/01/2025");
        
        quarto.exibirDados();
        hospede.exibirDados();
        reserva.exibirDados();
        
        System.out.println("TESTANDO CELULAR");
        Celular celular = new Celular("Nokia", "14 Pro", "AL2023231");
        celular.exibirInformacoes();
        
        

        
    }
}