package com.freightFox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freightFox.model.Seller;
import com.freightFox.repository.SellerRepository;

@Service
public class SellerServiceImpl implements SellerService {

	@Autowired
	private SellerRepository sellerRepo;
	
	@Override
	public Seller addSeller(Seller seller) {
		return sellerRepo.save(seller);
	}

	@Override
	public Seller getSellerById(Integer id) {
		return sellerRepo.findById(id).get();
	}

}
