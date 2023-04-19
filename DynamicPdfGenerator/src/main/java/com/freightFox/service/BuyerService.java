package com.freightFox.service;

import com.freightFox.exception.BuyerException;
import com.freightFox.exception.SellerException;
import com.freightFox.model.Buyer;

public interface BuyerService {

	public Buyer addBuyer(Buyer buyer, Integer sellerId) throws SellerException;
	
	public Buyer getBuyerById(Integer id) throws BuyerException;
}
