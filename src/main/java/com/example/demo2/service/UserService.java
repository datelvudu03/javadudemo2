package com.example.demo2.service;

import com.example.demo2.model.User;

public interface UserService {

    public void saveUser(User user);

    public boolean isUserAlreadyPresent(User user);
}

