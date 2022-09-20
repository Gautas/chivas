package com.perl.demo.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.perl.demo.model.Champ;

public interface champRepository extends ReactiveCrudRepository<Champ , String> {

	static Object save() {
		// TODO Auto-generated method stub
		return null;
	}

	static Object findById() {
		// TODO Auto-generated method stub
		return null;
	}

}
