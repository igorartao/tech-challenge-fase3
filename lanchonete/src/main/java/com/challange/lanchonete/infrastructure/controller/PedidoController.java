package com.challange.lanchonete.infrastructure.controller;

import com.challange.lanchonete.application.usecase.*;
import com.challange.lanchonete.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private final ICriarPedidoUseCase criarPedidoUseCase;
    private final IListarPedidosUseCase listarPedidosUseCase;
    private final IConsultarStatusPagamentoUseCase consultarStatusPagamentoUseCase;
    private final IProcessarConfirmacaoPagamentoUseCase processarConfirmacaoPagamentoUseCase;
    private final IAtualizarStatusPedidoUseCase atualizarStatusPedidoUseCase;

    @Autowired
    public PedidoController(ICriarPedidoUseCase criarPedidoUseCase, IListarPedidosUseCase listarPedidosUseCase, IConsultarStatusPagamentoUseCase consultarStatusPagamentoUseCase, IProcessarConfirmacaoPagamentoUseCase processarConfirmacaoPagamentoUseCase, IAtualizarStatusPedidoUseCase atualizarStatusPedidoUseCase) {
        this.criarPedidoUseCase = criarPedidoUseCase;
        this.listarPedidosUseCase = listarPedidosUseCase;
        this.consultarStatusPagamentoUseCase = consultarStatusPagamentoUseCase;
        this.processarConfirmacaoPagamentoUseCase = processarConfirmacaoPagamentoUseCase;
        this.atualizarStatusPedidoUseCase = atualizarStatusPedidoUseCase;
    }

    @PostMapping("/checkout")
    public Pedido criarPedido(@RequestBody PedidoRequest pedido) {
        return criarPedidoUseCase.execute(pedido);
    }

    @GetMapping
    public List<Pedido> listarPedidos() {
        return listarPedidosUseCase.execute();
    }

    @GetMapping("/{id}/status-pagamento")
    public StatusPagamento consultarStatusPagamento(@PathVariable Long id) {
        return consultarStatusPagamentoUseCase.execute(id);
    }

    @PostMapping("/confirmacao-pagamento")
    public void processarConfirmacaoPagamento(@RequestBody PagamentoConfirmacaoRequest pagamentoConfirmacaoRequest) {
        processarConfirmacaoPagamentoUseCase.execute(pagamentoConfirmacaoRequest);
    }

    @PutMapping("/{id}/status")
    public void atualizarStatusPedido(@PathVariable Long id, @RequestBody StatusPedido novoStatus) {
        atualizarStatusPedidoUseCase.execute(id, novoStatus);
    }
}