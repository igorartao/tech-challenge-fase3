package com.challange.lanchonete.infrastructure.controller;

import com.challange.lanchonete.domain.Categoria;
import com.challange.lanchonete.domain.Produto;
import com.challange.lanchonete.domain.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto) {
        return produtoService.criarProduto(produto);
    }

    @PutMapping("/{id}")
    public Produto editarProduto(@PathVariable Long id, @RequestBody Produto produto) {
        return produtoService.editarProduto(id, produto);
    }

    @DeleteMapping("/{id}")
    public void removerProduto(@PathVariable Long id) {
        produtoService.removerProduto(id);
    }

    @GetMapping("/categoria/{categoria}")
    public List<Produto> buscarProdutosPorCategoria(@PathVariable Categoria categoria) {
        return produtoService.buscarProdutosPorCategoria(categoria);
    }
}