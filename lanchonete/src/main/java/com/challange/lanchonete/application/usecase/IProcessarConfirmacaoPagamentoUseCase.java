package com.challange.lanchonete.application.usecase;

import com.challange.lanchonete.domain.PagamentoConfirmacaoRequest;

public interface IProcessarConfirmacaoPagamentoUseCase {
    void execute(PagamentoConfirmacaoRequest pagamentoConfirmacaoRequest);

}