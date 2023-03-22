package it.softwareInside.AnagraficaAppLezione23.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.softwareInside.AnagraficaAppLezione23.Models.Persona;
import it.softwareInside.AnagraficaAppLezione23.Repository.PersonaRepository;
import jakarta.validation.Valid;

@Service
public class PersonaService {

	@Autowired
	PersonaRepository personaRepository;

	public boolean addPersona(@Valid Persona persona) {
		try {
			personaRepository.save(persona);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	public Persona findPersona(String codiceFiscale) {
		try {
			return personaRepository.findById(codiceFiscale).get();
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}

	public boolean update(@Valid Persona persona) {
		return addPersona(persona);
	}

	public Persona removePersona(String codiceFiscale) {
		Persona persona = personaRepository.findById(codiceFiscale).get();
		personaRepository.deleteById(codiceFiscale);
		return persona;

	}

	public ArrayList<Persona> readPersona() {
		ArrayList<Persona> allPersona = (ArrayList<Persona>) personaRepository.findAll();
		return allPersona;
	}

	public ArrayList<Persona> list() {
		ArrayList<Persona> list = new ArrayList<>();

		for (Persona element : readPersona()) {
			if (element.getEta() >= 25)
				list.add(element);
		}
		return list;
	}

}
