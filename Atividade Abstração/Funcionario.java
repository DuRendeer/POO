public class Funcionario {
    String nome;
    Departamento departamento;
    
    public Funcionario(String nome, Departamento departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }
    
    public void exibirFuncionario() {
        System.out.println("Funcionrio: " + nome + " - Departamento: " + departamento.nome);
    }
}