package com.microservice.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.store.models.Store;
import com.microservice.store.service.StoreService;

@RestController
public class StoreController {
	
	@Autowired
	//@Qualifier("serviceRest")
	private StoreService StoreService;
		
	@GetMapping("/list")
	public List<Store> list(){
		return StoreService.findAll();
	}
	
	@GetMapping("/celular/{id}/cantidad/{cantidad}")
	public Store details(@PathVariable Long id, @PathVariable Integer cantidad) {
		return StoreService.findById(id, cantidad);
	}
	
}