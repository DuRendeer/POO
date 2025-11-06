package modelo;

import excecoes.EmailInvalidoException;

public class Cliente {
    private int id;
    private String nome;
    private String email;

    public Cliente(int id, String nome, String email) throws EmailInvalidoException {
        this.id = id;
        this.nome = nome;
        setEmail(email);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailInvalidoException {
        if (email == null || email.trim().isEmpty()) {
            throw new EmailInvalidoException("Email não pode ser vazio");
        }
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente #" + id + " - " + nome + " (" + email + ")";
    }
}
