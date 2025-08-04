public class Prato {
    String nome;
    double preco;
    
    public Prato(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public void exibirPrato() {
        System.out.println(nome + " R$ " + preco);
    }
}