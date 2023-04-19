package com.freightFox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.freightFox.model.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Integer> {

}
