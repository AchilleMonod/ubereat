package sopra.doctolib.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "Praticien")
public class Praticien {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Version
private int version;
private Civilite civilite;
private String Nom;
private String prenom;
private String telephone;
private Secteur secteur;
private  boolean carteVitale;
private  boolean cheque;
private  boolean espece;
private  Integer dureeCreneau;
@OneToMany(mappedBy = "praticien")
private List<Lieu> lieux;
@OneToMany(mappedBy = "praticien")
private List<Specialite> specialites;
@OneToMany(mappedBy = "praticien")
private List<Creneau> creneaux;


public Praticien() {
	super();
}


public Praticien(Long id, int version, Civilite civilite, String nom, String prenom, String telephone, Secteur secteur,
		boolean carteVitale, boolean cheque, boolean espece, Integer dureeCreneau, List<Lieu> lieux,
		List<Specialite> specialites, List<Creneau> creneaux) {
	super();
	this.id = id;
	this.version = version;
	this.civilite = civilite;
	Nom = nom;
	this.prenom = prenom;
	this.telephone = telephone;
	this.secteur = secteur;
	this.carteVitale = carteVitale;
	this.cheque = cheque;
	this.espece = espece;
	this.dureeCreneau = dureeCreneau;
	this.lieux = lieux;
	this.specialites = specialites;
	this.creneaux = creneaux;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public int getVersion() {
	return version;
}


public void setVersion(int version) {
	this.version = version;
}


public Civilite getCivilite() {
	return civilite;
}


public void setCivilite(Civilite civilite) {
	this.civilite = civilite;
}


public String getNom() {
	return Nom;
}


public void setNom(String nom) {
	Nom = nom;
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


public Secteur getSecteur() {
	return secteur;
}


public void setSecteur(Secteur secteur) {
	this.secteur = secteur;
}


public boolean isCarteVitale() {
	return carteVitale;
}


public void setCarteVitale(boolean carteVitale) {
	this.carteVitale = carteVitale;
}


public boolean isCheque() {
	return cheque;
}


public void setCheque(boolean cheque) {
	this.cheque = cheque;
}


public boolean isEspece() {
	return espece;
}


public void setEspece(boolean espece) {
	this.espece = espece;
}


public Integer getDureeCreneau() {
	return dureeCreneau;
}


public void setDureeCreneau(Integer dureeCreneau) {
	this.dureeCreneau = dureeCreneau;
}


public List<Lieu> getLieux() {
	return lieux;
}


public void setLieux(List<Lieu> lieux) {
	this.lieux = lieux;
}


public List<Specialite> getSpecialites() {
	return specialites;
}


public void setSpecialites(List<Specialite> specialites) {
	this.specialites = specialites;
}


public List<Creneau> getCreneaux() {
	return creneaux;
}


public void setCreneaux(List<Creneau> creneaux) {
	this.creneaux = creneaux;
}


@Override
public String toString() {
	return "Praticien [id=" + id + ", version=" + version + ", civilite=" + civilite + ", Nom=" + Nom + ", prenom="
			+ prenom + ", telephone=" + telephone + ", secteur=" + secteur + ", carteVitale=" + carteVitale
			+ ", cheque=" + cheque + ", espece=" + espece + ", dureeCreneau=" + dureeCreneau + ", lieux=" + lieux
			+ ", specialites=" + specialites + ", creneaux=" + creneaux + "]";
}


}
