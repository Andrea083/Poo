package br.edu.fatecfranca.ExemploBD.controller;

import br.edu.fatecfranca.ExemploBD.model.Produto;
import br.edu.fatecfranca.ExemploBD.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //responsável pelas requisições
@RequestMapping("/produto") //endpoint da API
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> listaTodos(){
        return produtoService.listaTodos();
    }
}
