public class Aluno {
    private String nome;
    private double nota;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }
    
    public void adicionarNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota += nota;
        }
    }
    
    public void retirarNota(double valor) {
        if (valor > 0 && valor <= this.nota) {
            this.nota -= valor;
        }
    }
    
    public double consultarNota() {
        return nota;
    }
}