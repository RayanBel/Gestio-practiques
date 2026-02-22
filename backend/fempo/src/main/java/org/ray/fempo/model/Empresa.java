package org.ray.fempo.model;

import jakarta.persistence.*;
// import jakarta.validation.constraints.NotBlank;
// import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "empresas")
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(unique = true)
	private int CIF;

	@Column(nullable = false)
	private String nom;

	@Column(nullable = true)
	private String sector;

	@Column(nullable = true)
	private String adreca; // Adreça

	@Column(nullable = true)
	private int telefon;

	@Column(nullable = true)
	private String email;

	@Column(nullable = true)
	private String estat; 

	public Empresa(){

	}

	public Empresa(String nom, int CIF, String sector, String adreca, int telefon, String email, String estat) { 
		this.nom = nom;
		this.CIF = CIF;
		this.sector = sector;
		this.adreca = adreca;
		this.telefon = telefon;
		this.email = email;
		this.estat = estat;
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
	
	public int getCIF() {
		return CIF;
	}

	public void setCIF(int CIF) {
		this.CIF = CIF;
	}
	public String getAdreca() {
		return adreca;
	}

	public void setAdreca(String adreca) {
		this.adreca = adreca;
	}
	
	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEstat() {
		return estat;
	}

	public void setEstat(String estat) {
		this.estat = estat;
	}
		
	public int getTelefon() {
		return telefon;
	}

	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}

}
