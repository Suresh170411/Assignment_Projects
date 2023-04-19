package com.freightFox.service;

import com.freightFox.model.Buyer;

public interface BuyerService {

	public Buyer addBuyer(Buyer buyer, Integer sellerId);
	
	public Buyer getBuyerById(Integer id);
}
