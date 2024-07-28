package com.challange.lanchonete.application.usecase;

import com.challange.lanchonete.domain.Pedido;
import com.challange.lanchonete.domain.PedidoRequest;

public interface ICriarPedidoUseCase {
    Pedido execute(PedidoRequest pedidoRequest);
}