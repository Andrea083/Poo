package br.edu.fatecfranca.ExemploAPI.model;

public class Produto {
    private int id;
    private String nome;
    private float preco;
    private int qtde;

    public Produto() {

    }

    public Produto(int id, String nome, float preco, int qtde) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
}
