package com.ust.ormlearn;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ust.ormlearn.model.Country;
import com.ust.ormlearn.repository.CountryRepository;
import com.ust.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {
	


public static void main(String[] args) {
	
final CountryService countryService;
ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
countryService = context.getBean(CountryService.class);
List<Country> countries = countryService.getAllCountries();
System.out.println("Inside application class after calling service"+countries);
 for(Country con:countries) 
{
 System.out.println(con);
}

 
 //2
 System.out.println(countryService.findCountryByCode("IN"));
//3
 Country cr=new Country();
 cr.setCode("c");
 cr.setName("china");
 countryService.addCountry(cr);
 //4
 Country cn = new Country();
 cn.setCode("c");
 cn.setName("turkey");
 countryService.updateCountry(cn);
 //5
 countryService.deleteCountry("c");
} 


}





