package sopra.doctolib.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public class Utilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Version
	private int version;
	@Column
	private String email;
	@Column
	private String motDePasse;
	@Enumerated(EnumType.STRING)
	@Column
	private Type type;
	@OneToMany(mappedBy= "utilisateur")
	private List<Patient> patients = new ArrayList<Patient>();
	@OneToOne
	private Praticien praticien;
	
	public Utilisateur() {
		super();
	}

	public Utilisateur( String email, String motDePasse, Type type, List<Patient> patients,
			Praticien praticien) {
		this.email = email;
		this.motDePasse = motDePasse;
		this.type = type;
		this.patients = patients;
		this.praticien = praticien;
	}

	public Long getId() {
		return id;
	}

	

	public int getVersion() {
		return version;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	public Praticien getPraticien() {
		return praticien;
	}

	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}
	
	
	

}
