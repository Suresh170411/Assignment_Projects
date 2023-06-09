package com.freightFox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.freightFox.exception.BuyerException;
import com.freightFox.exception.SellerException;
import com.freightFox.model.Buyer;
import com.freightFox.service.BuyerService;

@RestController
public class BuyerController {

	/**
	 * Injected BuyerService interface and extracting the data from it
	 */
	
	@Autowired
	private BuyerService buyerService;
	
	@PostMapping("/buyer/register/{sellerId}")
	public ResponseEntity<Buyer> addBuyerHandler(@RequestBody Buyer buyer, @PathVariable ("sellerId") Integer sellerId) throws SellerException{
		return new ResponseEntity<Buyer>(buyerService.addBuyer(buyer, sellerId), HttpStatus.CREATED);
	}
	
	@GetMapping("/buyer/{buyerId}")
	public ResponseEntity<Buyer> getBuyerByIdHandler(@PathVariable ("buyerId") Integer buyerId) throws BuyerException{
		return new ResponseEntity<Buyer>(buyerService.getBuyerById(buyerId), HttpStatus.OK);
	}
}
