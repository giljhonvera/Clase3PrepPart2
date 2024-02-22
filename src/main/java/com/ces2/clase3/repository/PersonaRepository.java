package com.ces2.clase3.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ces2.clase3.model.Persona;

@Repository
public class PersonaRepository {
	
private final List<Persona> personaList = new ArrayList<>();
	
	public List<Persona> findAll(){
		return personaList;
	}
	public void save(Persona persona) {
		personaList.add(persona);
	}
}
