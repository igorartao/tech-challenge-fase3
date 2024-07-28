package com.challange.lanchonete.application.usecase;

import com.challange.lanchonete.domain.Cliente;

public interface IIdentificarClienteUseCase {
    Cliente execute(String cpf);
}
