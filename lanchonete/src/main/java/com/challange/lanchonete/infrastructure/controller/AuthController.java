package com.challange.lanchonete.infrastructure.controller;

import com.challange.lanchonete.domain.Cliente;
import com.challange.lanchonete.infrastructure.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/auth")
    public Cliente authenticate(@RequestParam String cpf) {
        return clienteRepository.findByCpf(cpf);
    }
}