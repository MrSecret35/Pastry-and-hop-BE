package com.tass.microservice.users.microserviceusers.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/**
@Configuration
@EnableJpaRepositories( basePackages = "com.tass.microservice.users.microserviceusers.repository")
@EnableAutoConfiguration
@EnableTransactionManagement
@ComponentScan( basePackages = "com.tass.microservice.users.microserviceusers.entity.model")
@EntityScan( basePackages = "com.taas.Pastryandhop.entity.model")
**/
public class PersistenceConfig {
}