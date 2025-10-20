package br.edu.fatecfranca.ExemploAPI.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping( "/mensagem")
//classe vai responder as requisições
public class ExemploController {

    //verbo GET -> busca
    @GetMapping()
    public String consulta() {
        return "Este método faz um select no banco de dados";
    }

    //verbo GET
    @GetMapping("/{nome}/sobrenome/{sobrenome}") //vai mostrar o que definir no caminho
    public String consultaPersonalizada(@PathVariable String nome, @PathVariable String sobrenome){
       return "Também faz select, mas agora com cláusula where " + nome + " " + sobrenome;
    }

    //verbo POST -> inserção
    //quando eu insiro
    @PostMapping
    public String insere(){
        return "Este método faz um insert no banco de dados ";
    }

}



