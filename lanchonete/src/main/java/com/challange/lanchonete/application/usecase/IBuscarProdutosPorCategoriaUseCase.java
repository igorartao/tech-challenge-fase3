package com.challange.lanchonete.application.usecase;

import com.challange.lanchonete.domain.Categoria;
import com.challange.lanchonete.domain.Produto;

import java.util.List;

public interface IBuscarProdutosPorCategoriaUseCase {
    List<Produto> execute(Categoria categoria);
}