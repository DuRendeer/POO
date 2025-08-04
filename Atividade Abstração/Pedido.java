import java.util.ArrayList;

public class Pedido {
    Cliente cliente;
    ArrayList<Prato> pratos;
    
    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.pratos = new ArrayList<>();
    }
    
    public void adicionarPrato(Prato prato) {
        pratos.add(prato);
    }
    
    public void exibirPedido() {
        System.out.println("PEDIDO");
        cliente.exibirNome();
        System.out.println("Pratos pedidos:");
        
        double total = 0;
        for (Prato prato : pratos) {
            System.out.print("- ");
            prato.exibirPrato();
            total += prato.preco;
        }
        
        System.out.println("Total R$ " + total);
        System.out.println("");
    }
}