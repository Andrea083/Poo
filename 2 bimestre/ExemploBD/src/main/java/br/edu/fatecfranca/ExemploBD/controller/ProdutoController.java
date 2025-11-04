package br.edu.fatecfranca.ExemploBD.controller;

import br.edu.fatecfranca.ExemploBD.model.Produto;
import br.edu.fatecfranca.ExemploBD.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController //responsável pelas requisições
@RequestMapping("/produto") //endpoint da API
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> listaTodos(){
        return produtoService.listaTodos();
    } //retorna um vetor vazio

    @PostMapping
    public Produto insere(@RequestBody Produto produto){
        return produtoService.insere(produto);
    }

    @GetMapping("/{id}")
    public Optional<Produto> listaPorId(@PathVariable Long id){
        return produtoService.listaPorId(id);
    }

    @DeleteMapping("/{id}")
    public boolean remover(@PathVariable Long id){
        return produtoService.remover(id);
    }

    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable Long id, @RequestBody Produto novoProduto){
        return produtoService.atualizar(id, novoProduto);
    }

}
