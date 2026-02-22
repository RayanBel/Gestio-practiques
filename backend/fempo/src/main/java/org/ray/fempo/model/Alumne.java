package org.ray.fempo.model;

import jakarta.persistence.*;
// import jakarta.validation.constraints.NotBlank;
// import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "alumne")
public class Alumne {
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

	public Alumne(){

	}

	public Alumne(int DNI, String nom, String email, LocalDate naixement){
		this.DNI = DNI;
		this.nom = nom;
		this.email = email;
		this.naixement = naixement;
	}

	public long getId(){
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getDNI() {
		return DNI;
	}

	public void setDNI(int DNI) {
		this.DNI = DNI;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getnaixement() {
		return naixement;
	}

	public void setnaixement(LocalDate naixement) {
		this.naixement = naixement;
	}
	
	
}
