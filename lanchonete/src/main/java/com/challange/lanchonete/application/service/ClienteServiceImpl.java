package com.challange.lanchonete.application.service;

import com.challange.lanchonete.domain.Cliente;
import com.challange.lanchonete.domain.repository.ClienteRepository;
import com.challange.lanchonete.domain.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente cadastrarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente identificarCliente(String cpf) {
        return clienteRepository.findByCpf(cpf);
    }
}
