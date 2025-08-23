class Veiculo {
    void mover() {
        System.out.println("Veiculo se movendo");
    }
}

class Carro extends Veiculo {
    @Override
    void mover() {
        System.out.println("Carro rodando pelas ruas");
    }
}

class Bicicleta extends Veiculo {
    @Override
    void mover() {
        System.out.println("Bicicleta pedalando");
    }
}

public class Exercicio2 {
    static void testar_movimento(Veiculo veiculo_bernardo) {
        System.out.print("Teste de movimento : ");
        veiculo_bernardo.mover();
    }
    
    public static void main(String[] args) {
        Carro carro_local = new Carro();
        Bicicleta bicicleta_local = new Bicicleta();
        Veiculo veiculo_generico = new Veiculo();
        
        testar_movimento(carro_local);
        testar_movimento(bicicleta_local);
        testar_movimento(veiculo_generico);
        
        System.out.println();
        System.out.println("Polimorfismo com upcasting:");
        
        Veiculo v1 = new Carro();
        Veiculo v2 = new Bicicleta();
        
        v1.mover();
        v2.mover();
    }
}