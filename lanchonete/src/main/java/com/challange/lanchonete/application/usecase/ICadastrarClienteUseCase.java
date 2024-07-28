package com.challange.lanchonete.application.usecase;

import com.challange.lanchonete.domain.Cliente;

public interface ICadastrarClienteUseCase {
    Cliente execute(Cliente cliente);
}