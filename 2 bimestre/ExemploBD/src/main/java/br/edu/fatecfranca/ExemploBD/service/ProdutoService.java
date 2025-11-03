package br.edu.fatecfranca.ExemploBD.service;

import br.edu.fatecfranca.ExemploBD.model.Produto;
import br.edu.fatecfranca.ExemploBD.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    // injeção de dependência = usar um objeto para chamar um método sem precisar instancia-lo
    @Autowired
    private ProdutoRepository produtoRepository;

    //método que consulta todos os produtos
    public List<Produto> listaTodos(){
        return produtoRepository.findAll();
    }
}
