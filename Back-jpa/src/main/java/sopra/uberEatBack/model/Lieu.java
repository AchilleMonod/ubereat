package sopra.doctolib.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;



@Entity
@Table(name = "lieu")
public class Lieu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Version
	private int version;
	@Column
	private String nom;
	@Column
	private String information;
	@ManyToOne
	private Praticien praticien;
	@OneToMany(mappedBy = "lieu")
	private List<Creneau> creneaux = new ArrayList<Creneau>();
	@Embedded
	private Adresse adresse;
	
	
	public Lieu() {
		super();
	}


	public Lieu(String nom, String information, Praticien praticien, List<Creneau> creneaux,
			Adresse adresse) {
		this.nom = nom;
		this.information = information;
		this.praticien = praticien;
		this.creneaux = creneaux;
		this.adresse = adresse;
	}


	public Long getId() {
		return id;
	}



	public int getVersion() {
		return version;
	}




	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getInformation() {
		return information;
	}


	public void setInformation(String information) {
		this.information = information;
	}


	public Praticien getPraticien() {
		return praticien;
	}


	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}


	public List<Creneau> getCreneaux() {
		return creneaux;
	}


	public void setCreneaux(List<Creneau> creneaux) {
		this.creneaux = creneaux;
	}


	public Adresse getAdresse() {
		return adresse;
	}


	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}


	@Override
	public String toString() {
		return "Lieu [id=" + id + ", version=" + version + ", nom=" + nom + ", information=" + information
				+ ", praticien=" + praticien + ", creneaux=" + creneaux + ", adresse=" + adresse + "]";
	}
	
	
	
	
}
