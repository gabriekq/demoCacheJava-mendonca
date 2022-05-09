package com.mendonca.demo.cache;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CasaService {

	@Autowired
	CasaServiceComponent casaServiceComponent;
	
	public List<Casa> getTodos(){
		
	return	casaServiceComponent.getCasas(); // nao funciona pq os dois metodos estao na mesma classe entao o @Cacheable(cacheNames = "casas" ) nao atua
	}
	
	
	
	
	
}
