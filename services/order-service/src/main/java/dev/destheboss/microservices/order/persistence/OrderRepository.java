package dev.destheboss.microservices.order.persistence;

import dev.destheboss.microservices.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
