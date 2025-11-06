package modelo;

import enums.CategoriaProduto;
import excecoes.PrecoInvalidoException;

public class Produto {
    private int id;
    private String nome;
    private double preco;
    private CategoriaProduto categoria;

    public Produto(int id, String nome, double preco, CategoriaProduto categoria) throws PrecoInvalidoException {
        this.id = id;
        this.nome = nome;
        setPreco(preco);
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setPreco(double preco) throws PrecoInvalidoException {
        if (preco <= 0) {
            throw new PrecoInvalidoException("Preço deve ser positivo");
        }
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto #" + id + " - " + nome + " | R$ " + String.format("%.2f", preco) + " | " + categoria;
    }
}
