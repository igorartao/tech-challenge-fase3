package com.challange.lanchonete.application.usecase;

import com.challange.lanchonete.infrastructure.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemoverProdutoUseCase implements IRemoverProdutoUseCase {

    private final ProdutoRepository produtoRepository;

    @Autowired
    public RemoverProdutoUseCase(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public void execute(Long id) {
        produtoRepository.deleteById(id);
    }
}