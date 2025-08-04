public class Reserva {
    Quarto quarto;
    Hospede hospede;
    String dataEntrada;
    String dataSaida;
    
    public Reserva(Quarto quarto, Hospede hospede, String dataEntrada, String dataSaida) {
        this.quarto = quarto;
        this.hospede = hospede;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }
    
    public void exibirDados() {
        System.out.println("RESERVA");
        System.out.println("Hospede: " + hospede.nome);
        System.out.println("Quarto: " + quarto.numero + " (" + quarto.tipo + ")");
        System.out.println("Entrada: " + dataEntrada);
        System.out.println("Saída: " + dataSaida);
        System.out.println("");
    }
}