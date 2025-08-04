public class Celular {
    String marca;
    String modelo;
    String numeroSerie;
    
    public Celular(String marca, String modelo, String numeroSerie) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }
    
    public void exibirInformacoes() {
        System.out.println("CELULAR");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Numero de Série: " + numeroSerie);
        System.out.println("");
    }
}