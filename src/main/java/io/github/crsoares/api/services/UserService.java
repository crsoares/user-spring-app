package io.github.crsoares.api.services;

import io.github.crsoares.api.domain.User;
import io.github.crsoares.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
}
