package io.github.crsoares.api.services;

import io.github.crsoares.api.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
}
