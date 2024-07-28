package com.challange.lanchonete.application.usecase;

import com.challange.lanchonete.domain.StatusPedido;

public interface IAtualizarStatusPedidoUseCase {
    void execute(Long pedidoId, StatusPedido novoStatus);
}