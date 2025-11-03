package br.edu.fatecfranca.ExemploBD.repository;

import br.edu.fatecfranca.ExemploBD.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    //esta interface herdará todos os métodos de crud prontos da classe Produto
    // Long indica tipo de dado de chave primária do Produto
}
