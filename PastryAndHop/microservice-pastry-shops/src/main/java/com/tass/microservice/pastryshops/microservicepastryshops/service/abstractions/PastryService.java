package com.tass.microservice.pastryshops.microservicepastryshops.service.abstractions;

import com.tass.microservice.pastryshops.microservicepastryshops.model.Pastry;

import java.util.List;
import java.util.Optional;

public interface PastryService {
    List<Pastry> getPastries();
    Optional<Pastry> getPastryById(Long id);
    Pastry savePastry(Pastry pastry);
    void deletePastry(Long id);
}
