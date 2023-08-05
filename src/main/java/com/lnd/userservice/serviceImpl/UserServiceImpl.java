package com.lnd.userservice.serviceImpl;

import com.lnd.userservice.domains.User;
import com.lnd.userservice.exceptions.ResourceNotFoundException;
import com.lnd.userservice.repositories.UserRepository;
import com.lnd.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository repository;
    @Override
    public User saveUser(User user) {
        return this.repository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return this.repository.findAll();
    }

    @Override
    public User getUser(Integer userId) {
        return this.repository.findById(userId).
                orElseThrow(() -> new ResourceNotFoundException("Resource not found with the id "+userId));
    }
}
