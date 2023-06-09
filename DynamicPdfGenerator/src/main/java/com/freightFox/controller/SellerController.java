package com.freightFox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.freightFox.exception.SellerException;
import com.freightFox.model.Seller;
import com.freightFox.service.SellerService;

@RestController
public class SellerController {

	@Autowired
	private SellerService sellerService;
	
	@PostMapping("/seller/register")
	public ResponseEntity<Seller> addSellerHandler(@RequestBody Seller seller){
		return new ResponseEntity<Seller>(sellerService.addSeller(seller),HttpStatus.CREATED);
	}
	
	@GetMapping("/seller/{sellerId}")
	public ResponseEntity<Seller> getSellerByIdHandler(@PathVariable ("sellerId") Integer sellerId) throws SellerException{
		return new ResponseEntity<Seller>(sellerService.getSellerById(sellerId), HttpStatus.OK);
	}
	
}
