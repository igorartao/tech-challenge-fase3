package com.challange.lanchonete.application.usecase;

import com.challange.lanchonete.domain.Pedido;
import com.challange.lanchonete.domain.StatusPagamento;
import com.challange.lanchonete.domain.exception.ResourceNotFoundException;
import com.challange.lanchonete.infrastructure.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultarStatusPagamentoUseCase implements IConsultarStatusPagamentoUseCase {

    private final PedidoRepository pedidoRepository;

    @Autowired
    public ConsultarStatusPagamentoUseCase(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    public StatusPagamento execute(Long pedidoId) {
        Pedido pedido = pedidoRepository.findById(pedidoId)
                .orElseThrow(() -> new ResourceNotFoundException("Pedido não encontrado"));
        return pedido.getStatusPagamento();
    }
}