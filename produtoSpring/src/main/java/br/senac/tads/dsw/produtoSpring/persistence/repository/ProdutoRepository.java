package br.senac.tads.dsw.produtoSpring.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senac.tads.dsw.produtoSpring.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    
}
