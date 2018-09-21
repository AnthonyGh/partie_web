package fr.m2iformation.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Spectacle {

	@NotEmpty
	@Size(min=5, max=15, message="Entre 5 et 15 caractères")
	private String prenom;
	
	@Min(value=10, message="minimum 10 ans")
	private Integer age;
	private String adresse;


	public Spectacle(@NotEmpty @Size(min = 5, max = 15, message = "Entre 5 et 15 caractères") String prenom,
			@Min(value = 10, message = "minimum 10 ans") Integer age, String adresse) {
		
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
	}

	public Spectacle() {
		this(null, null, null);
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
