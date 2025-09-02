import java.util.ArrayList;
import java.util.List;

abstract class Funcionario {
    String nome;
    double salario;
    
    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    abstract double calcularBonus();
}

class Gerente extends Funcionario {
    Gerente(String nome, double salario) {
        super(nome, salario);
    }
    
    @Override
    double calcularBonus() {
        return salario * 0.20;
    }
}

class Vendedor extends Funcionario {
    Vendedor(String nome, double salario) {
        super(nome, salario);
    }
    
    @Override
    double calcularBonus() {
        return salario * 0.10;
    }
}

public class Exercicio3 {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("Moaca", 5000));
        funcionarios.add(new Vendedor("Bernardo", 3000));
        funcionarios.add(new Gerente("Pedro", 6000));
        funcionarios.add(new Vendedor("Bernarda", 2500));
        
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.nome + " - Bonus: R$ " + funcionario.calcularBonus());
        }
    }
}