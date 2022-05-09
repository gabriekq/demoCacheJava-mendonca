package com.mendonca.demo.cache;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class CasaServiceComponent {

	@Autowired
	CasaRepository casaRepository;
	
	@Cacheable(cacheNames = "casas" )
	public List<Casa> getCasas(){
		System.out.println("Sem cache");
		return casaRepository.findAll();
		
	}
	
	
	
	
	
}
