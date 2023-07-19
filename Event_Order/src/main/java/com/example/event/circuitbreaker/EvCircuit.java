package com.example.event.circuitbreaker;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.event.feign.EvFeign;

@Component
public class EvCircuit implements EvFeign {

	@Override
	public ResponseEntity<?> getAll(@PathVariable String id) {
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@Override
	public ResponseEntity<?> create(Object data) {
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
