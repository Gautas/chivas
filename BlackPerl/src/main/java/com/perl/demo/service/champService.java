package com.perl.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.perl.demo.config.orikaConfig;
import com.perl.demo.dto.RequestDTO;
import com.perl.demo.model.Champ;
import com.perl.demo.repository.champRepository;

import ma.glasnost.orika.MapperFacade;

public class champService {
	@Autowired
	champRepository champrepository;

	

	public Object save(Champ abcd) {
		MapperFacade facade= new orikaConfig();
		Champ c= new Champ();
		RequestDTO dto=facade.map(c, RequestDTO.class);
		//or
		RequestDTO dt=new RequestDTO();
		Champ chmp=facade.map(dt, Champ.class);
		
		return champRepository.save() ;
	}

	public Object findById() {
		// TODO Auto-generated method stub
		 return champRepository.findById();
	}

}
