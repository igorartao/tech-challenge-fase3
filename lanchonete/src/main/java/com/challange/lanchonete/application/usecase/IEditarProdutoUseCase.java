package com.challange.lanchonete.application.usecase;

import com.challange.lanchonete.domain.Produto;

public interface IEditarProdutoUseCase {
    Produto execute(Long id, Produto produto);
}