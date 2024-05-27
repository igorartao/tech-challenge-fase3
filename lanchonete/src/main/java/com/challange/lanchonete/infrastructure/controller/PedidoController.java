package com.challange.lanchonete.infrastructure.controller;

import com.challange.lanchonete.domain.Pedido;
import com.challange.lanchonete.domain.PedidoRequest;
import com.challange.lanchonete.domain.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping("/checkout")
    public Pedido criarPedido(@RequestBody PedidoRequest pedido) {
        return pedidoService.criarPedido(pedido);
    }

    @GetMapping
    public List<Pedido> listarPedidos() {
        return pedidoService.listarPedidos();
    }

}