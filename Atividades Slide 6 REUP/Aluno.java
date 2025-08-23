public class Aluno extends Pessoa {
     public int matricula;

     public Aluno(String nome, int matricula) {
         super(nome); 
         this.matricula = matricula;
     }

     public void exibirDados() {
         System.out.println("Nome : " +nome);
         System.out.println("Matricula : " + matricula);
     }
}