package com.freightFox.service;

import com.freightFox.exception.SellerException;
import com.freightFox.model.Seller;

public interface SellerService {

	public Seller addSeller(Seller seller);
	
	public Seller getSellerById(Integer id) throws SellerException;
}
