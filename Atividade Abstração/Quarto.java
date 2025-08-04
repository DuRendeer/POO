public class Quarto {
    int numero;
    String tipo;
    String status;
    
    public Quarto(int numero, String tipo, String status) {
        this.numero = numero;
        this.tipo = tipo;
        this.status = status;
    }
    
    public void exibirDados() {
        System.out.println("Quarto " + numero);
        System.out.println("Tipo: " + tipo);
        System.out.println("Status: " + status);
        System.out.println();
    }
}