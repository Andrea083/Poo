package br.edu.fatecfranca.ExemploAPI.controller;

import br.edu.fatecfranca.ExemploAPI.model.Produto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//classe rest controler. Padrão de projeto mvc (model(mais aproxima do banco de dados),
// view(no back-end não faz a view por isso usamos o Insomnia) e controler(leva requisição do usuário e devolve para o view))
@RestController
//@RequestMapping( "/mensagem")
@RequestMapping( "/produto")
//classe vai responder as requisições
public class ExemploController { //controlador das requisições rest

    //cria vetor de lista de produtos
    List<Produto> produtos = new ArrayList<Produto>();

    //verbo GET -> busca
    @GetMapping()

    //public String consulta() { //sem vetor
    //    return "Este método faz um select no banco de dados";

    public List<Produto> consulta(){
        return produtos;
    }

    //verbo GET com requisição diferente
    //@GetMapping("/{nome}/sobrenome/{sobrenome}") //vai mostrar o que definir no caminho
    //public String consultaPersonalizada(@PathVariable String nome, @PathVariable String sobrenome){
       //return "Também faz select, mas agora com cláusula where " + nome + " " + sobrenome;
       // mostrar apenas elemento especificado
    @GetMapping("/{id}")
    public Produto consultaPersonalizada(@PathVariable int id){
        for(Produto produto: produtos){
            if (produto.getId() == id){
                return produto;
            }
        }
        //não retornou
        return null;
    }

    //verbo POST -> inserção no banco de dados, tem que passar o que quer do banco dentro do body
    @PostMapping
    public Produto insere(@RequestBody Produto produto){
        produtos.add(produto);
        return produto;
    }
    //public String insere(@RequestBody Produto produto){ //sem vetor
    //    return "Este método faz um insert no banco de dados ";
    //}

    //remover
    @DeleteMapping("/{id}")
    public boolean remover (@PathVariable int id){
        for(Produto produto: produtos){
            if (produto.getId() == id){
                return produtos.remove(produto);
            }
        }
        return false;
    }


}



