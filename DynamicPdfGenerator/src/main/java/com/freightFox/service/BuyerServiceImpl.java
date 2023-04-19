package com.freightFox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freightFox.exception.BuyerException;
import com.freightFox.exception.SellerException;
import com.freightFox.model.Buyer;
import com.freightFox.model.Seller;
import com.freightFox.repository.BuyerRepository;
import com.freightFox.repository.SellerRepository;

@Service
public class BuyerServiceImpl implements BuyerService {

	@Autowired
	private BuyerRepository buyerRepo;

	@Autowired
	private SellerRepository sellerRepo;
	@Override
	public Buyer addBuyer(Buyer buyer, Integer sellerId) throws SellerException {
		Seller seller = sellerRepo.findById(sellerId).get();
		
		if (seller == null) {
			throw new SellerException("No seller is found with this id !");
		}
		
		seller.getBuyers().add(buyer);
		buyer.setSeller(seller);
		
		return buyerRepo.save(buyer);
	}

	@Override
	public Buyer getBuyerById(Integer id) throws BuyerException {
		return buyerRepo.findById(id).orElseThrow(()-> new BuyerException("No buyer is found with this id !"));
	}
}
