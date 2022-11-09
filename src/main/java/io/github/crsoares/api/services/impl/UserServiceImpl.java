package io.github.crsoares.api.services.impl;

import io.github.crsoares.api.domain.User;
import io.github.crsoares.api.repositories.UserRepository;
import io.github.crsoares.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
