package it.softwareInside.AnagraficaAppLezione23.Repository;

import org.springframework.data.repository.CrudRepository;

import it.softwareInside.AnagraficaAppLezione23.Models.Persona;

public interface PersonaRepository extends CrudRepository<Persona, String> {

}
