package com.taas.Pastryandhop.controller;

import com.taas.Pastryandhop.config.SwaggerConfig;
import com.taas.Pastryandhop.domain.model.PastryShopDTO;
import com.taas.Pastryandhop.service.PastryShopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(SwaggerConfig.PASTRY_SHOP_API_BASE_PATH)
public class PastryShopController {

    private final Logger log = LoggerFactory.getLogger(PastryShopController.class);

    @Autowired
    PastryShopService pastryShopService;

    @GetMapping("/")
    public List<PastryShopDTO> getPastryShop(){
        log.info("PastryShopController: getPastryShop called");
        return pastryShopService.getAllPastryShop();

    }
}
