class Administrador implements Autenticavel {
    private String nome;
    private String senhaCorreta;

    public Administrador(String nome, String senhaCorreta) {
        this.nome = nome;
        this.senhaCorreta = senhaCorreta;
    }

    @Override
    public boolean autenticar(String senha) {
        return senhaCorreta.equals(senha);
    }

    public String getNome() {
        return nome;
    }
}