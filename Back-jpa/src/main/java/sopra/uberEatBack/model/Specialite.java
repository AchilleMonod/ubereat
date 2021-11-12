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

public class Specialite {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Version
	private int version;
	private String nom;
	@ManyToOne
	private Praticien praticien;
	@OneToMany(mappedBy ="specialite")
	private List<Motif> motifs = new ArrayList<Motif>();
	
	
	
	public Specialite() {
		super();
	}
	public Specialite(String nom, Praticien praticien, List<Motif> motifs) {
		super();
		this.nom = nom;
		this.praticien = praticien;
		this.motifs = motifs;
	}
	public Long getId() {
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
	public Praticien getPraticien() {
		return praticien;
	}
	public void setPraticien(Praticien praticien) {
		this.praticien = praticien;
	}
	public List<Motif> getMotifs() {
		return motifs;
	}
	public void setMotifs(List<Motif> motifs) {
		this.motifs = motifs;
	}

}
