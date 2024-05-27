package com.challange.lanchonete.domain.repository;

import com.challange.lanchonete.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
