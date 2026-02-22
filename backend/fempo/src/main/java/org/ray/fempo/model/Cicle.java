package org.ray.fempo.model;

import jakarta.persistence.*;
// import jakarta.validation.constraints.NotBlank;
// import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "alumne")
public class Cicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(unique = true)
	private int DNI;

	@Column(nullable = false)
	private String nom;

	@Column(unique = true)
	private String email;

	@Column(nullable = false)
	private LocalDate naixement;

	public Cicle(){

	}
}
