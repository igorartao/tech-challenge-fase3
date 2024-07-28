package com.challange.lanchonete.infrastructure.repository;

import com.challange.lanchonete.domain.ProdutoPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoPedidoRepository extends JpaRepository<ProdutoPedido, Long> {
}
