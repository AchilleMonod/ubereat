package sopra.doctolib.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;
@Entity

public class Motif {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)	
private long id;
@Version
private int version;
private String nom;
private int nbCreneau;
@ManyToOne
private Specialite specialite;
@OneToMany(mappedBy = "motif")
private List<Consultation> consultations=new ArrayList<Consultation>();



public Motif() {
	super();
}
public Motif(String nom, int nbCreneau, Specialite specialite, List<Consultation> consultations) {
	super();
	this.nom = nom;
	this.nbCreneau = nbCreneau;
	this.specialite = specialite;
	this.consultations = consultations;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getNbCreneau() {
	return nbCreneau;
}
public void setNbCreneau(int nbCreneau) {
	this.nbCreneau = nbCreneau;
}
public Specialite getSpecialite() {
	return specialite;
}
public void setSpecialite(Specialite specialite) {
	this.specialite = specialite;
}
public List<Consultation> getConsultations() {
	return consultations;
}
public void setConsultations(List<Consultation> consultations) {
	this.consultations = consultations;
}


}
