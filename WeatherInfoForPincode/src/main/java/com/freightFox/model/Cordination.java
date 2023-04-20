package com.freightFox.model;

/**
 * Class for mapping the JSON properties with the property of this class
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cordination {

	private String lon;
	private String lat;
}
