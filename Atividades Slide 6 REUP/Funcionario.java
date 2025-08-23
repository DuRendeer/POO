public class Funcionario {
    public String nome;
    public Double salario;


    public void setF(String nome,Double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void mostraF(){
        System.out.println("Dados:");
        System.out.println("Nome : " + nome);
        System.out.println("Salario : " + salario);
        
    }
}
