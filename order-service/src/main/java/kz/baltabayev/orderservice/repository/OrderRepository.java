package kz.baltabayev.orderservice.repository;

import kz.baltabayev.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
