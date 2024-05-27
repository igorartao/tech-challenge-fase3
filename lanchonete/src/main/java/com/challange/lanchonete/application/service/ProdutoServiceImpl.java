package com.challange.lanchonete.application.service;

import com.challange.lanchonete.domain.Categoria;
import com.challange.lanchonete.domain.Produto;
import com.challange.lanchonete.domain.repository.ProdutoRepository;
import com.challange.lanchonete.domain.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public Produto criarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public Produto editarProduto(Long id, Produto produto) {
        Produto existente = produtoRepository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        existente.setNome(produto.getNome());
        existente.setCategoria(produto.getCategoria());
        existente.setValor(produto.getValor());
        existente.setDescricao(produto.getDescricao());
        return produtoRepository.save(existente);
    }

    @Override
    public void removerProduto(Long id) {
        produtoRepository.deleteById(id);
    }

    @Override
    public List<Produto> buscarProdutosPorCategoria(Categoria categoria) {
        return produtoRepository.findByCategoria(categoria);
    }
}