package com.freightFox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.freightFox.model.Buyer;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer, Integer> {

}
