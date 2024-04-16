package com.ecomm.nhom4.Service.Repository;

import com.ecomm.nhom4.Service.Entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    List<Cart> findByIdUser(long idUser);

}
