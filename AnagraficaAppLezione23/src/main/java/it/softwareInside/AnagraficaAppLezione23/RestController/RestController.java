package it.softwareInside.AnagraficaAppLezione23.RestController;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import it.softwareInside.AnagraficaAppLezione23.Models.Persona;
import it.softwareInside.AnagraficaAppLezione23.Service.PersonaService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@Autowired
	PersonaService personaService;

	@PostMapping("/crea")
	public boolean addPersona(@RequestBody Persona persona) {
		return personaService.addPersona(persona);
	}

	@PostMapping("/update")
	public boolean update(@RequestBody Persona persona) {
		return personaService.addPersona(persona);
	}


	@DeleteMapping("/delete")
	public Persona deletePersona(@RequestParam String codiceFiscale) {
		return personaService.removePersona(codiceFiscale);
	}
	
	@GetMapping("/list")
	public ArrayList<Persona> list(){
		
		return personaService.list();
	}
}
