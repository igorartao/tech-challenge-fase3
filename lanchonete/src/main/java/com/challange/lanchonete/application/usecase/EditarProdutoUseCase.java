package com.challange.lanchonete.application.usecase;

import com.challange.lanchonete.domain.Produto;
import com.challange.lanchonete.infrastructure.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditarProdutoUseCase implements IEditarProdutoUseCase {

    private final ProdutoRepository produtoRepository;

    @Autowired
    public EditarProdutoUseCase(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public Produto execute(Long id, Produto produto) {
        Produto produtoExistente = produtoRepository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        produtoExistente.setNome(produto.getNome());
        produtoExistente.setValor(produto.getValor());
        produtoExistente.setCategoria(produto.getCategoria());
        return produtoRepository.save(produtoExistente);
    }
}

