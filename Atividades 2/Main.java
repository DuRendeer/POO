import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      List<Aluno> alunos = new ArrayList<>();
      alunos.add(new Aluno("Bernardo Pai","000001","Agronomia"));
      alunos.add(new Aluno("Bernardo Jr","000002","Aculputura"));
      alunos.add(new Aluno("Pedro do Mangal","000003","Cartomante"));

      System.out.println("Lista de Alunos:");
      for (Aluno aluno : alunos){
         System.out.println(aluno.toString());
      } 
      System.out.println("-----------");
      System.out.println("Calculadora");

      Calculadora calc = new Calculadora();
      System.out.println("Soma de 2 Int : " + calc.soma(2,12));
      System.out.println("Soma de 2 Double : " + calc.soma(3.15,12.90));
      System.out.println("Soma de 3 Int : " + calc.soma(2,12,69));

    }
}