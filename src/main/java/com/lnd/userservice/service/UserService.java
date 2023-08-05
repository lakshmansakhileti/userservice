package com.lnd.userservice.service;

import com.lnd.userservice.domains.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUser();

    User getUser(Integer userId);
}
