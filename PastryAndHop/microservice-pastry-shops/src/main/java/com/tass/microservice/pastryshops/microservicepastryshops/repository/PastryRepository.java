package com.tass.microservice.pastryshops.microservicepastryshops.repository;

import com.tass.microservice.pastryshops.microservicepastryshops.model.Pastry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PastryRepository extends JpaRepository<Pastry,Long> {
}
