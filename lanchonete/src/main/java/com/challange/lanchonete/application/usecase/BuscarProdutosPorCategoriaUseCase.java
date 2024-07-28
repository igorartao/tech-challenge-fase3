package com.challange.lanchonete.application.usecase;

import com.challange.lanchonete.domain.Categoria;
import com.challange.lanchonete.domain.Produto;
import com.challange.lanchonete.infrastructure.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuscarProdutosPorCategoriaUseCase implements IBuscarProdutosPorCategoriaUseCase {

    private final ProdutoRepository produtoRepository;

    @Autowired
    public BuscarProdutosPorCategoriaUseCase(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public List<Produto> execute(Categoria categoria) {
        return produtoRepository.findByCategoria(categoria);
    }
}