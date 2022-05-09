package com.mendonca.demo.cache;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CasaContoller {

	@Autowired
	CasaService casaService;
	
	@GetMapping("/casas")
	public List<Casa> getCasa(){
		
		
		return casaService.getTodos();
		
	}
	
	
	
	
}
