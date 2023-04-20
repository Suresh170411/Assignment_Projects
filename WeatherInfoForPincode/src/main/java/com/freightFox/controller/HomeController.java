package com.freightFox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.freightFox.model.Description;
import com.freightFox.service.WeatherService;

/**
 * Creted the REST api end point where user can pass the pincode and can get the weather inforamation
 * @author suresh
 *
 */

@RestController
public class HomeController {

	/**
	 * Autowired the service layer interface using the cunstructor approach
	 */
	
	private WeatherService service;
	
	@Autowired
	public HomeController(WeatherService service) {
		this.service = service;
	}
	
	@GetMapping("/api/{stateCode}")
	public ResponseEntity<Description> getData(@PathVariable ("stateCode") String stateCode) {
		return new ResponseEntity<Description>(service.getAllData(stateCode),HttpStatus.OK);
	}
}
