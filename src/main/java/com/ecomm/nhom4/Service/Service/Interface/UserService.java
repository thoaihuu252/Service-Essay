package com.ecomm.nhom4.Service.Service.Interface;

import com.ecomm.nhom4.Service.Entity.User;

import java.util.Optional;

public interface UserService {

    public Optional<User> checkLogin(String email, String password);
    public boolean register(User user);

}
