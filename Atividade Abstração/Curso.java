public class Curso {
    String nome;
    String codigo;
    int cargaHoraria;
    
    public Curso(String nome, String codigo, int cargaHoraria) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }
    
    public void exibirDados() {
        System.out.println("Curso: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        System.out.println();
    }
}