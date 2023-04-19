package com.freightFox.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Seller {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String sellerName;
	private String sellerGstin;
	
	@Embedded
	private Address address;
	
	//Entity Relationship
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "seller")
	@JsonIgnore
	private List<Buyer> buyers = new ArrayList<>();
}
