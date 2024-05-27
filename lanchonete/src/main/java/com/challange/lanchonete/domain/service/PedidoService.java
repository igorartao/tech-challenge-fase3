package com.challange.lanchonete.domain.service;

import com.challange.lanchonete.domain.Pedido;
import com.challange.lanchonete.domain.PedidoRequest;

import java.util.List;

public interface PedidoService {
    Pedido criarPedido(PedidoRequest pedido);
    List<Pedido> listarPedidos();
}
