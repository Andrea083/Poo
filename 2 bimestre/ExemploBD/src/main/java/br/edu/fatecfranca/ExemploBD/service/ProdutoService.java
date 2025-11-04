package br.edu.fatecfranca.ExemploBD.service;

import br.edu.fatecfranca.ExemploBD.model.Produto;
import br.edu.fatecfranca.ExemploBD.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    // injeção de dependência = usar um objeto para chamar um método sem precisar instancia-lo
    @Autowired
    private ProdutoRepository produtoRepository;

    //método que consulta todos os produtos
    public List<Produto> listaTodos(){
        return produtoRepository.findAll();
    }

    //método que consulta um produto em particular
    public Optional<Produto> listaPorId(Long id){
        // se o findById() encontrar um produto, retorna ele
        // se o findById não encontrar, retorna null
        // select * from tb_produto where tb_produto.id = id
        return produtoRepository.findById(id);
    }

    //método para inserir um produto na tabela tb_produto
    public Produto insere(Produto produto){
        return produtoRepository.save(produto); //chama a interface ProdutoRepository
    }

    //método para remover um produto da tabela tb_produto
    public boolean remover(Long id) {
        // delete from tb_produto where tb_produto.id = id
        if (produtoRepository.existsById(id)) { // verifica se o produto existe
            produtoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    // método para atualizar um produto na tabela
    public Produto atualizar(Long id, Produto novoProduto){
        if(produtoRepository.existsById(id)){ //verifica se o produto existe
            novoProduto.setId(id); //atualiza novoProduto com o id
            return produtoRepository.save(novoProduto); // atualiza e retorna produto atualizado
        }
        return null; //caso o produto não exista
    }
}
