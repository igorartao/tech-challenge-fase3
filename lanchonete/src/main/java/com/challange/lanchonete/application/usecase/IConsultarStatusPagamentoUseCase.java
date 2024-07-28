package com.challange.lanchonete.application.usecase;

import com.challange.lanchonete.domain.StatusPagamento;

public interface IConsultarStatusPagamentoUseCase {
    StatusPagamento execute(Long pedidoId);
}
