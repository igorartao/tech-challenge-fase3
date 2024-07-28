package com.challange.lanchonete.application.usecase;

import com.challange.lanchonete.domain.Cliente;
import com.challange.lanchonete.infrastructure.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdentificarClienteUseCase implements IIdentificarClienteUseCase {

    private final ClienteRepository clienteRepository;

    @Autowired
    public IdentificarClienteUseCase(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente execute(String cpf) {
        return clienteRepository.findByCpf(cpf);
    }
}