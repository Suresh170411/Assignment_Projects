package com.freightFox.model;

/**
 * Class for mapping the JSON properties with the property of this class
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationInfo {

	private String country;
	private String sunrise;
	private String sunset;
}
