package com.freightFox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freightFox.exception.SellerException;
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
	public Seller getSellerById(Integer id) throws SellerException {
		return sellerRepo.findById(id).orElseThrow(()-> new SellerException("No seller is found with this id !"));
	}

}
