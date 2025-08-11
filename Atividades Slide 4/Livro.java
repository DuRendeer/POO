public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isBlank()) {
            this.titulo = titulo;
        }
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        if (autor != null && !autor.isBlank()) {
            this.autor = autor;
        }
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        if (ano >= 0) {
            this.ano = ano;
        }
    }
}