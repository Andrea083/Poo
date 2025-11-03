package br.edu.fatecfranca.ExemploBD.model;

import jakarta.persistence.*;

@Entity // a classe é uma entidade do BD
@Table(name="tb_produto") // a classe é uma tabela do banco de dados
public class Produto {
    @Id // id é uma chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //valor do id gerado automaticamente
    private long id;

    private String nome;
    private String descricao;
    private Double preco;

    public Produto() {
    }

    public Produto(String nome, String descricao, Double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
