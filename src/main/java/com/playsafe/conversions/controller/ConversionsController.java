package com.playsafe.conversions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.playsafe.conversions.services.ConversionsService;

@RestController
@RequestMapping("/conversions")
public class ConversionsController {
	
	 @Autowired
	    private ConversionsService conversionsService;
	 
	
	  @PostMapping("/ktoc/{kelvin}")
	    public Double convertKtoC(@PathVariable Double kelvin) {

		  return kelvin - 273.2;
	    }
	  @PostMapping("/ctok/{degreesCelsius}")
	    public Double  convertCtoK(@PathVariable Double degreesCelsius) {
	    	   return degreesCelsius + 273.2;
	    }

	  @PostMapping("/mtok/{distanceInMiles}")
	    public Double convermtok(@PathVariable Double distanceInMiles) {

		  return distanceInMiles * 1.60934;
	    }
	  
	  @PostMapping("/ktom/{distanceInKm}")
	    public Double  convertktom(@PathVariable Double distanceInKm) {
		  return distanceInKm * 0.621371;
	    }
}
