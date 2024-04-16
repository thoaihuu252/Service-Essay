package com.ecomm.nhom4.Service.Repository;

import com.ecomm.nhom4.Service.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
