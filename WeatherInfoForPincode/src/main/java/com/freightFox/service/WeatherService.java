package com.freightFox.service;

/**
 * Interface for creating the methods for extracting the Weather API
 */

import com.freightFox.model.Description;

public interface WeatherService {

	public Description getAllData(String stateCode);
}
