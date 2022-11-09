package io.github.crsoares.api.services;

import io.github.crsoares.api.domain.User;

public interface UserService {

    User findById(Integer id);
}
