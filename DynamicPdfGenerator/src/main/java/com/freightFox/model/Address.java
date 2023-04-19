package com.freightFox.model;

import lombok.Data;

/**
 * This is a normal java class containing certain fields
 * Here @Data annotation is for Lombok which is used to replace getters and setters
 */

@Data
public class Address {

	private String state;
	private String country;
}
