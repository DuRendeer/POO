abstract class Veiculo {
    String marca;
    String modelo;
    
    Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    abstract void acelerar();
    
    void exibirDados() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}

class Carro extends Veiculo {
    Carro(String marca, String modelo) {
        super(marca, modelo);
    }
    
    @Override
    void acelerar() {
        System.out.println("O carro ta acelerando...");
    }
}

class Moto extends Veiculo {
    Moto(String marca, String modelo) {
        super(marca, modelo);
    }
    
    @Override
    void acelerar() {
        System.out.println("A moto ta acelerando...");
    }
}

public class Exercicio2 {
    public static void main(String[] args) {
        Carro carro = new Carro("Cavalo", "Branco");
        Moto moto = new Moto("HK", "Hornet");
        
        carro.exibirDados();
        carro.acelerar();
        
        moto.exibirDados();
        moto.acelerar();
    }
}