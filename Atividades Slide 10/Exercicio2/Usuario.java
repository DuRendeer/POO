public class Usuario {
    private String nome;
    private int idade;

    public Usuario(String nome, int idade) throws IdadeInvalidaException {
        if (idade < 18) {
            throw new IdadeInvalidaException("Idade invalida, usuario deve ter +18");
        }
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
