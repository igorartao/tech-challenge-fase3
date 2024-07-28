package com.challange.lanchonete.application.usecase;

import com.challange.lanchonete.domain.Produto;

public interface ICriarProdutoUseCase {
    Produto execute(Produto produto);
}