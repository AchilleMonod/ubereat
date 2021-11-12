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
public class Consultation {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)	
private Long id;
@Version
private int version;
private String instruction;
@ManyToOne
private Motif motif;
@ManyToOne
private Patient patient;
@OneToMany(mappedBy ="consultation")
private List<Creneau> creneaux = new ArrayList<Creneau>();


public Consultation() {
	super();
}
public Consultation(String instruction, Motif motif, Patient patient, List<Creneau> creneaux) {
	super();
	this.instruction = instruction;
	this.motif = motif;
	this.patient = patient;
	this.creneaux = creneaux;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getInstruction() {
	return instruction;
}
public void setInstruction(String instruction) {
	this.instruction = instruction;
}
public Motif getMotif() {
	return motif;
}
public void setMotif(Motif motif) {
	this.motif = motif;
}
public Patient getPatient() {
	return patient;
}
public void setPatient(Patient patient) {
	this.patient = patient;
}
public List<Creneau> getCreneaux() {
	return creneaux;
}
public void setCreneaux(List<Creneau> creneaux) {
	this.creneaux = creneaux;
}




}
