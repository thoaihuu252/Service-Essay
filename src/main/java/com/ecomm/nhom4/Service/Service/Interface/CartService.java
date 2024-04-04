package com.ecomm.nhom4.Service.Service.Interface;

import com.ecomm.nhom4.Service.Entity.Cart;

import java.util.List;

public interface CartService {
    public Cart saveCart(Cart cart);
    public List<Cart> getCartByUser(Long idUser);
    public void deleteCart(Long id);
}
