package com.freightFox.exception;

/**
 * Created custom exception class for handling any exception related to Buyer Class
 *
 */
public class BuyerException extends Exception {

	public BuyerException () {
		
	}
	
	public BuyerException (String message) {
		super(message);
	}
}
