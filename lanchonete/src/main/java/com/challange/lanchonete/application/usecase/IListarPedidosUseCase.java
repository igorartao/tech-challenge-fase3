package com.challange.lanchonete.application.usecase;

import com.challange.lanchonete.domain.Pedido;
import java.util.List;

public interface IListarPedidosUseCase {
    List<Pedido> execute();
}