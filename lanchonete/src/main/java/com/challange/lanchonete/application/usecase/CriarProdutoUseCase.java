package com.challange.lanchonete.application.usecase;

import com.challange.lanchonete.domain.Produto;
import com.challange.lanchonete.infrastructure.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CriarProdutoUseCase implements ICriarProdutoUseCase {

    private final ProdutoRepository produtoRepository;

    @Autowired
    public CriarProdutoUseCase(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public Produto execute(Produto produto) {
        return produtoRepository.save(produto);
    }
}