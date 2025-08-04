public class Hospede {
    String nome;
    String documento;
    
    public Hospede(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }
    
    public void exibirDados() {
        System.out.println("Hospede: " + nome);
        System.out.println("Documento: " + documento);
        System.out.println();
    }
}