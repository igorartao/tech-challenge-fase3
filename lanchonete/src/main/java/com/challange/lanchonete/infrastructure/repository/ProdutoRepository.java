package com.challange.lanchonete.infrastructure.repository;

import com.challange.lanchonete.domain.Categoria;
import com.challange.lanchonete.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByCategoria(Categoria categoria);
}