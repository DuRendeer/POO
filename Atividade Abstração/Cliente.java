public class Cliente {
    String nome;
    
    public Cliente(String nome) {
        this.nome = nome;
    }
    
    public void exibirNome() {
        System.out.println("Cliente: " + nome);
    }
}