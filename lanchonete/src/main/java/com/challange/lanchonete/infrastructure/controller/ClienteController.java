package com.challange.lanchonete.infrastructure.controller;

import com.challange.lanchonete.domain.Cliente;
import com.challange.lanchonete.domain.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Cliente cadastrarCliente(@RequestBody Cliente cliente) {
        return clienteService.cadastrarCliente(cliente);
    }

    @GetMapping("/{cpf}")
    public Cliente identificarCliente(@PathVariable String cpf) {
        return clienteService.identificarCliente(cpf);
    }
}
