package sopra.uberEatBack.model;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	private String voie;
	private String complement ;
	private String codePostale;
	private String ville;
	
	
	public Adresse() {
		super();
	}
	public Adresse(String voie, String complement, String codePostale, String ville) {
		super();
		this.voie = voie;
		this.complement = complement;
		this.codePostale = codePostale;
		this.ville = ville;
	}
	public String getVoie() {
		return voie;
	}
	public void setVoie(String voie) {
		this.voie = voie;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getCodePostale() {
		return codePostale;
	}
	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}

	

}
