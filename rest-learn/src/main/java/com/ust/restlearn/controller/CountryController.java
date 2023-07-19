package com.ust.restlearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.restlearn.model.Country;
import com.ust.restlearn.service.CountryService;


@RestController
public class CountryController {

	@Autowired
	private CountryService countryService;		
	
	@GetMapping("/countries/{code}") 
	public Country getCountry(@PathVariable String code) {
		
		Country country= countryService.findCountryByCode(code);	
				
		return country;
	}
	
	@GetMapping("/countries") 
	public List<Country> getAllCountries() {
		
	List<Country> countries= countryService.getAllCountries();
		
		return countries;		
		
	}
	
	@PostMapping("/countries")
	public Country createCountry(@RequestBody Country country) {
		
		countryService.addCountry(country);
				
		return country;		
		
	}
	
	@DeleteMapping("/countries/{code}")
	public void deleteCountry(@PathVariable String code) {
		
		countryService.deleteCountry(code);
		
	}
	
	
	@PutMapping("/countries/{code}") 
	public Country updateCountry(@RequestBody Country country ) {
		
		countryService.updateCountry(country) ;
				
		return country;
	}
}

