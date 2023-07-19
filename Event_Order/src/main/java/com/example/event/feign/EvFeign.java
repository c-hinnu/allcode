package com.example.event.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.event.circuitbreaker.EvCircuit;


@FeignClient(name="EventManagament-Events",fallback=EvCircuit.class)
 
public interface EvFeign {
	@GetMapping("/event/{id}")
	ResponseEntity<?> getAll(@PathVariable String id);
	
	
	@PostMapping("/event")
	ResponseEntity<?> create(@RequestBody Object data);	
	
	
	
	
	
}
