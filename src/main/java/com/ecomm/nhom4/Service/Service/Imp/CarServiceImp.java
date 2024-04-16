package com.ecomm.nhom4.Service.Service.Imp;

import com.ecomm.nhom4.Service.Entity.Cart;
import com.ecomm.nhom4.Service.Repository.CartRepository;
import com.ecomm.nhom4.Service.Service.Interface.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImp implements CartService {
    @Autowired
    private CartRepository cartRepository;

    @Override
    public Cart saveCart(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public List<Cart> getCartByUser(Long idUser) {
        //get by id user
        return cartRepository.findByIdUser(idUser);
    }

    @Override
    public void deleteCart(Long id) {
        // Delete by id cart
        cartRepository.deleteById(id);

    }
}
