package com.challange.lanchonete.application.usecase;

import com.challange.lanchonete.domain.Pedido;
import com.challange.lanchonete.domain.StatusPedido;
import com.challange.lanchonete.infrastructure.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListarPedidosUseCase implements IListarPedidosUseCase {

    private final PedidoRepository pedidoRepository;

    @Autowired
    public ListarPedidosUseCase(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    public List<Pedido> execute() {
        return pedidoRepository.findAll().stream()
                .filter(pedido -> pedido.getStatus() != StatusPedido.FINALIZADO)
                .sorted(Comparator.comparing((Pedido p) -> {
                    switch (p.getStatus()) {
                        case PRONTO:
                            return 1;
                        case EM_PREPARACAO:
                            return 2;
                        case RECEBIDO:
                            return 3;
                        default:
                            return 4;
                    }
                }).thenComparing(Pedido::getId))
                .collect(Collectors.toList());
    }
}