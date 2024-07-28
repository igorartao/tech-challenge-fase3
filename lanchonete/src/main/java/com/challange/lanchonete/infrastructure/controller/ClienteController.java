package com.challange.lanchonete.infrastructure.controller;

import com.challange.lanchonete.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.challange.lanchonete.application.usecase.ICadastrarClienteUseCase;
import com.challange.lanchonete.application.usecase.IIdentificarClienteUseCase;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ICadastrarClienteUseCase cadastrarClienteUseCase;
    private final IIdentificarClienteUseCase identificarClienteUseCase;

    @Autowired
    public ClienteController(ICadastrarClienteUseCase cadastrarClienteUseCase, IIdentificarClienteUseCase identificarClienteUseCase) {
        this.cadastrarClienteUseCase = cadastrarClienteUseCase;
        this.identificarClienteUseCase = identificarClienteUseCase;
    }

    @PostMapping
    public Cliente cadastrarCliente(@RequestBody Cliente cliente) {
        return cadastrarClienteUseCase.execute(cliente);
    }

    @GetMapping("/{cpf}")
    public Cliente identificarCliente(@PathVariable String cpf) {
        return identificarClienteUseCase.execute(cpf);
    }
}