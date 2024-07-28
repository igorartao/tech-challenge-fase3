package com.challange.lanchonete.infrastructure.controller;

import com.challange.lanchonete.application.usecase.IBuscarProdutosPorCategoriaUseCase;
import com.challange.lanchonete.application.usecase.ICriarProdutoUseCase;
import com.challange.lanchonete.application.usecase.IEditarProdutoUseCase;
import com.challange.lanchonete.application.usecase.IRemoverProdutoUseCase;
import com.challange.lanchonete.domain.Categoria;
import com.challange.lanchonete.domain.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ICriarProdutoUseCase criarProdutoUseCase;
    private final IEditarProdutoUseCase editarProdutoUseCase;
    private final IRemoverProdutoUseCase removerProdutoUseCase;
    private final IBuscarProdutosPorCategoriaUseCase buscarProdutosPorCategoriaUseCase;

    @Autowired
    public ProdutoController(ICriarProdutoUseCase criarProdutoUseCase, IEditarProdutoUseCase editarProdutoUseCase, IRemoverProdutoUseCase removerProdutoUseCase, IBuscarProdutosPorCategoriaUseCase buscarProdutosPorCategoriaUseCase) {
        this.criarProdutoUseCase = criarProdutoUseCase;
        this.editarProdutoUseCase = editarProdutoUseCase;
        this.removerProdutoUseCase = removerProdutoUseCase;
        this.buscarProdutosPorCategoriaUseCase = buscarProdutosPorCategoriaUseCase;
    }

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto) {
        return criarProdutoUseCase.execute(produto);
    }

    @PutMapping("/{id}")
    public Produto editarProduto(@PathVariable Long id, @RequestBody Produto produto) {
        return editarProdutoUseCase.execute(id, produto);
    }

    @DeleteMapping("/{id}")
    public void removerProduto(@PathVariable Long id) {
        removerProdutoUseCase.execute(id);
    }

    @GetMapping("/categoria/{categoria}")
    public List<Produto> buscarProdutosPorCategoria(@PathVariable Categoria categoria) {
        return buscarProdutosPorCategoriaUseCase.execute(categoria);
    }
}