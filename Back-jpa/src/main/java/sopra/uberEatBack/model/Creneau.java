package sopra.doctolib.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
@Entity
public class Creneau {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Version
	private int version;
	private LocalDateTime debut;
	private Integer duree;
	private boolean dispo;
	
	@ManyToOne
	private Consultation consultation;
	
	@ManyToOne
	private Praticien praticien;
	@ManyToOne
	private Lieu lieu;
	
	
	
	
	public Creneau() {
		super();
	}
	public Creneau(LocalDateTime debut, Integer duree, boolean dispo, Consultation consultation, Praticien praticien,
			Lieu lieu) {
		super();
		this.debut = debut;
		this.duree = duree;
		this.dispo = dispo;
		this.consultation = consultation;
		this.praticien = praticien;
		this.lieu = lieu;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getDebut() {
		return debut;
	}
	public void setDebut(LocalDateTime debut) {
		this.debut = debut;
	}
	public Integer getDuree() {
		return duree;
	}
	public void setDuree(Integer duree) {
		this.duree = duree;
	}
	public boolean isDispo() {
		return dispo;
	}
	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}
	public Consultation getConsultation() {
		return consultation;
	}
	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}
	public Praticien getPraticien() {
		return praticien;
	}
	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}
	public Lieu getLieu() {
		return lieu;
	}
	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}
	
}
