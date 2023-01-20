package com.tass.microservice.users.microserviceusers.service.abstractions;

import com.tass.microservice.users.microserviceusers.entity.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getUsers();
    Optional<User> getUser(Long id);
    User saveUser(User user);
    void deleteUser (Long id);
}
