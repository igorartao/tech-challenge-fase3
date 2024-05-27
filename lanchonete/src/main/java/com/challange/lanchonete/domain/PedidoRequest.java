package com.challange.lanchonete.domain;

import lombok.Data;

import java.util.List;

@Data
public class PedidoRequest {
    private Long clienteId;
    private List<Long> produtoIds;
}