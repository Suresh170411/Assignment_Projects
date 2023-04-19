package com.freightFox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.freightFox.model.Buyer;
import com.freightFox.service.BuyerService;

@RestController
public class BuyerController {

	@Autowired
	private BuyerService buyerService;
	
	@PostMapping("/buyer/register/{sellerId}")
	public ResponseEntity<Buyer> addBuyerHandler(@RequestBody Buyer buyer, @PathVariable ("sellerId") Integer sellerId){
		return new ResponseEntity<Buyer>(buyerService.addBuyer(buyer, sellerId), HttpStatus.CREATED);
	}
}
