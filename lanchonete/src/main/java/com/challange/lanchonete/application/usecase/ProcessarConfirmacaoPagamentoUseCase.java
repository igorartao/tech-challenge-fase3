package com.challange.lanchonete.application.usecase;

import com.challange.lanchonete.domain.PagamentoConfirmacaoRequest;
import com.challange.lanchonete.domain.Pedido;
import com.challange.lanchonete.domain.exception.ResourceNotFoundException;
import com.challange.lanchonete.infrastructure.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcessarConfirmacaoPagamentoUseCase implements IProcessarConfirmacaoPagamentoUseCase {

    private final PedidoRepository pedidoRepository;

    @Autowired
    public ProcessarConfirmacaoPagamentoUseCase(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    public void execute(PagamentoConfirmacaoRequest pagamentoConfirmacaoRequest) {
        Pedido pedido = pedidoRepository.findById(pagamentoConfirmacaoRequest.getPedidoId())
                .orElseThrow(() -> new ResourceNotFoundException("Pedido não encontrado"));
        pedido.setStatusPagamento(pagamentoConfirmacaoRequest.getStatusPagamento());
        pedidoRepository.save(pedido);
    }
}