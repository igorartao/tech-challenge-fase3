package com.challange.lanchonete.domain.service;

import com.challange.lanchonete.domain.Categoria;
import com.challange.lanchonete.domain.Produto;

import java.util.List;

public interface ProdutoService {
    Produto criarProduto(Produto produto);
    Produto editarProduto(Long id, Produto produto);
    void removerProduto(Long id);
    List<Produto> buscarProdutosPorCategoria(Categoria categoria);
}
