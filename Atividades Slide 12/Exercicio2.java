class Veiculo {
    public void abastecer() {
        System.out.println("Abastecendo combustível");
    }
}

class Bicicleta extends Veiculo {
    @Override
    public void abastecer() {
        throw new UnsupportedOperationException("Bicicleta não abastece"); 
    } // VIOLAÇÃO subclasse não pode substituir a classe base sem quebrar o comportamento
}

interface Abastecivel {  // SOLUÇÃO interface separada garante q apenas quem pode abastecer implementa esse comportamento
    void abastecer();
}

class Carro implements Abastecivel {
    public void abastecer() {
        System.out.println("Abastecendo gasolina");
    }
}
