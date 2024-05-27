package com.challange.lanchonete.domain.service;

import com.challange.lanchonete.domain.Cliente;

public interface ClienteService {
    Cliente cadastrarCliente(Cliente cliente);
    Cliente identificarCliente(String cpf);
}
