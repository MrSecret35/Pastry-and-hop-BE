package com.taas.Pastryandhop.repository;

import com.taas.Pastryandhop.entity.model.PastryShop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PastryShopRepository
        extends JpaRepository<PastryShop, Integer>{
}
