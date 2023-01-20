package com.tass.microservice.users.microserviceusers.repository;

import com.tass.microservice.users.microserviceusers.entity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
