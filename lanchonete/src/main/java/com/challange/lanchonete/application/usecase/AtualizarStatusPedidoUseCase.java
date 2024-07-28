package com.challange.lanchonete.application.usecase;

import com.challange.lanchonete.domain.Pedido;
import com.challange.lanchonete.domain.StatusPedido;
import com.challange.lanchonete.domain.exception.ResourceNotFoundException;
import com.challange.lanchonete.infrastructure.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtualizarStatusPedidoUseCase implements IAtualizarStatusPedidoUseCase {

    private final PedidoRepository pedidoRepository;

    @Autowired
    public AtualizarStatusPedidoUseCase(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    public void execute(Long pedidoId, StatusPedido novoStatus) {
        Pedido pedido = pedidoRepository.findById(pedidoId)
                .orElseThrow(() -> new ResourceNotFoundException("Pedido não encontrado"));
        pedido.setStatus(novoStatus);
        pedidoRepository.save(pedido);
    }
}