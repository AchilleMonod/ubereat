package sopra.doctolib.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;
@Entity
@Table(name="patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Version
	private int version;
	@Enumerated(EnumType.STRING)
	private Civilite civilite;
	private String nom;
	private String prenom;
	private String telephone;
	private LocalDate dtNaissance;
	private String email;
	private boolean principale;
	@OneToMany(mappedBy ="patient")
	private List<Consultation> consultations= new ArrayList<Consultation>();
	@Embedded
	private Adresse adresse;
	@ManyToOne
	private Utilisateur utilisateur;
	

	public Patient() {
		super();
	}
	
	
	
	public Patient(Civilite civilite, String nom, String prenom, String telephone, LocalDate dtNaissance, String email,
			boolean principale, List<Consultation> consultations, Adresse adresse, Utilisateur utilisateur) {
		super();
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.dtNaissance = dtNaissance;
		this.email = email;
		this.principale = principale;
		this.consultations = consultations;
		this.adresse = adresse;
		this.utilisateur = utilisateur;
	}



	public Long getId() {
		return id;
	}

	public Civilite getCivilite() {
		return civilite;
	}
	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public LocalDate getDtNaissance() {
		return dtNaissance;
	}
	public void setDtNaissance(LocalDate dtNaissance) {
		this.dtNaissance = dtNaissance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isPrincipale() {
		return principale;
	}
	public void setPrincipale(boolean principale) {
		this.principale = principale;
	}
	public List<Consultation> getConsultations() {
		return consultations;
	}
	public void setConsultations(List<Consultation> consultations) {
		this.consultations = consultations;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	

}
