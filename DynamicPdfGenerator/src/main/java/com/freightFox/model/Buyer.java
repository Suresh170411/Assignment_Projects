package com.freightFox.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Buyer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String buyerName;
	private String buyerGstin;
	
	@Embedded
	private Address address;
	
	@Embedded
	@ElementCollection(fetch = FetchType.EAGER)
	private List<Items> items = new ArrayList<>();
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Seller seller;
}
