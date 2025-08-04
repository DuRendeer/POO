import java.util.ArrayList;

public class Aluno {
    String nome;
    String matricula;
    ArrayList<Float> notas;
    
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new ArrayList<>();
    }
    
    public void adicionarNota(float nota) {
        notas.add(nota);
    }
    
    public float calcularMedia() {
        if (notas.isEmpty()) {
            return 0;
        }
        
        float soma = 0;
        for (float nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }
    
    public void exibirBoletim() {
        System.out.println("BOLETIM ");
        System.out.println("Aluno: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.print("Notas: ");
        for (int i = 0; i < notas.size(); i++) {
            System.out.print(notas.get(i));
            if (i < notas.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Media: " + calcularMedia());
        System.out.println("");
    }
}