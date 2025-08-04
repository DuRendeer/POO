import java.util.ArrayList;

public class Departamento {
    String nome;
    ArrayList<Funcionario> funcionarios;
    
    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }
    
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    
    public void exibirDepartamento() {
        System.out.println("DEPARTAMENTO: " + nome);
        System.out.println("Funcionarios:");
        for (Funcionario func : funcionarios) {
            System.out.println("-" + func.nome);
        }
        System.out.println("Total de funcionários: " + funcionarios.size());
        System.out.println("");
    }
}