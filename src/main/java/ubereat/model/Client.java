package ubereat.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
@Entity
public class Client extends Utilisateur {
	
	private String cb;
	@OneToMany(mappedBy="client")
	private List<Commande> commandes =new ArrayList<Commande>();
	@Embedded
	private List<Adresse> adresses =new ArrayList<Adresse>(); // to check ? 
	
	
	public Client() {
		super();
	}
	
	public Client(String cb, List<Commande> commandes, List<Adresse> adresses) {
		super();
		this.cb = cb;
		this.commandes = commandes;
		this.adresses = adresses;
	}

	public String getCb() {
		return cb;
	}
	public void setCb(String cb) {
		this.cb = cb;
	}
	public List<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
	public List<Adresse> getAdresses() {
		return adresses;
	}
	public void setAdresses(List<Adresse> adresses) {
		this.adresses = adresses;
	}

}
