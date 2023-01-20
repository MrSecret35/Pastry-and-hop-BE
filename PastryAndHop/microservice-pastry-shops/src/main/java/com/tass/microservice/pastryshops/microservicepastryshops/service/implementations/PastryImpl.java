package com.tass.microservice.pastryshops.microservicepastryshops.service.implementations;

import com.tass.microservice.pastryshops.microservicepastryshops.model.Pastry;
import com.tass.microservice.pastryshops.microservicepastryshops.repository.PastryRepository;
import com.tass.microservice.pastryshops.microservicepastryshops.service.abstractions.PastryService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PastryImpl implements PastryService {

    private PastryRepository pastryRepository;

    @Autowired
    public PastryImpl(PastryRepository pastryRepository) {
        this.pastryRepository = pastryRepository;
    }

    @Override
    public List<Pastry> getPastries() {
        return pastryRepository.findAll();
    }

    @Override
    public Optional<Pastry> getPastryById(Long id) {
        return pastryRepository.findById(id);
    }

    @Override
    public Pastry savePastry(Pastry pastry) {
        return pastryRepository.save(pastry);
    }

    @Override
    public void deletePastry(Long id) {
        pastryRepository.deleteById(id);
    }
}
