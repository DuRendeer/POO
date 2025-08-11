public class Animal {
    private String nome;
    private String especie;
    
    public String consultarDados() {
        return "Nome: " + nome + ", Especie: " + especie;
    }
    
    public void mudarNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }
    
    public String getEspecie() {
        return especie;
    }
    
    public void setEspecie(String especie) {
        if (especie != null && !especie.isBlank()) {
            this.especie = especie;
        }
    }
}