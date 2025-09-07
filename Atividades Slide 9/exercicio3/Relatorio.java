import java.time.LocalDate;

class Relatorio implements Imprimivel {
    private String titulo;
    private String conteudo;
    private LocalDate data;

    public Relatorio(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.data = LocalDate.now();
    }

    @Override
    public void imprimir() {
        System.out.println("=== RELATÓRIO ===");
        System.out.println("Título: " + titulo);
        System.out.println("Data: " + data);
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("==================");
    }
}