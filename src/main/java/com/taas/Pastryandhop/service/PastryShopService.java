package com.taas.Pastryandhop.service;

import com.taas.Pastryandhop.domain.model.PastryShopDTO;
import com.taas.Pastryandhop.entity.model.PastryShop;
import com.taas.Pastryandhop.repository.PastryShopRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PastryShopService {

    private final Logger log = LoggerFactory.getLogger(PastryShopService.class);

    ModelMapper modelMapper = new ModelMapper();;
    @Autowired
    PastryShopRepository pastryShopRepository;
    public List<PastryShopDTO> getAllPastryShop(){
        List<PastryShop> pastryShopsList= pastryShopRepository.findAll();
        //log.info(pastryShopRepository.findAll().toString());
        List<PastryShopDTO> pastryShopsListDTO= pastryShopsList.stream().map(x->modelMapper.map(x, PastryShopDTO.class)).collect(Collectors.toList());
        return pastryShopsListDTO;
    }
}
