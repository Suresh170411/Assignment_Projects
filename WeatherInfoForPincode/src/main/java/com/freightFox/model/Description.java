package com.freightFox.model;

/**
 * Class for mapping the JSON properties with the property of this class
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Description {
	
	private String timezone;
	private String name;
	private Information main;
	private Weather[] weather;
	private String visibility;
	private Cordination coord;
	private LocationInfo sys;
	
}
