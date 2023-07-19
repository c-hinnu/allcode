package com.ust.restlearn.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ust.restlearn.model.Country;
import com.ust.restlearn.repository.CountryRepository;



@Service 
public class CountryService {
	@Autowired
	private CountryRepository countryrepository;
	@Transactional 
	public List<Country> getAllCountries(){
		return countryrepository.findAll();
	}
	@Transactional 
	public Country  findCountryByCode(String countryCode) 
	{
		Optional<Country> result = countryrepository.findById(countryCode); 
		Country country=result.get();
		return country;
    }
	@Transactional 
	public void addCountry(Country country) 
	{
		countryrepository.save(country);
	}
	@Transactional
	public void updateCountry(Country country) 
	{
		Optional<Country> result = countryrepository.findById(country.getCode());
		result.get().setName(country.getName());
		countryrepository.save(country);
	}
	@Transactional
	public void deleteCountry(String code)
	{
		countryrepository.deleteById(code);
	}
	
	
	
	
	
	
	
	}
