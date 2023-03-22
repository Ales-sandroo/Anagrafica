package it.softwareInside.AnagraficaAppLezione23.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Persona {

	@Id
	@Size(min = 5 , max = 5)
	private String codiceFiscale;

	
	@Min(value = 15, message = "L'eta non dovrebbere essere minore di 15")
	private int eta;

	@NotNull
	@NotEmpty
	private String nome;

	@NotNull
	@NotEmpty
	private String cognome;

}
