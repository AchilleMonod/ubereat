package sopra.doctolib;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sopra.doctolib.config.AppConfig;
import sopra.doctolib.model.Adresse;
import sopra.doctolib.model.Civilite;
import sopra.doctolib.model.Consultation;
import sopra.doctolib.model.Creneau;
import sopra.doctolib.model.Lieu;
import sopra.doctolib.model.Motif;
import sopra.doctolib.model.Patient;
import sopra.doctolib.model.Praticien;
import sopra.doctolib.model.Specialite;
import sopra.doctolib.model.Type;
import sopra.doctolib.model.Utilisateur;
import sopra.doctolib.repository.IConsultation;
import sopra.doctolib.repository.ICreneau;
import sopra.doctolib.repository.ILieu;
import sopra.doctolib.repository.IMotif;
import sopra.doctolib.repository.IPatient;
import sopra.doctolib.repository.IPraticien;
import sopra.doctolib.repository.ISpecialite;
import sopra.doctolib.repository.IUtilisateur;



public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext spring = new AnnotationConfigApplicationContext(AppConfig.class);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		IConsultation consultationRepo = spring.getBean(IConsultation.class);
		ICreneau creneauRepo = spring.getBean(ICreneau.class);
		ILieu lieuRepo = spring.getBean(ILieu.class);
		IMotif motifRepo = spring.getBean(IMotif.class);
		IPatient patientRepo = spring.getBean(IPatient.class);
		IPraticien praticienRepo = spring.getBean(IPraticien.class);
		ISpecialite specialiteRepo = spring.getBean(ISpecialite.class);
		IUtilisateur utilisateurRepo = spring.getBean(IUtilisateur.class);

		
		

		Patient michel = new Patient(); 
		michel.setCivilite(Civilite.MME);
		michel.setNom("BILAL");
		michel.setPrenom("Michel");
		michel.setTelephone("0606060606");
		
		michel = patientRepo.save(michel);

		Patient odil = new Patient();
		odil.setCivilite(Civilite.MME);
		odil.setNom("DERAIE");
		odil.setPrenom("Odil");
		odil.setTelephone("0612121212");
		
		odil = patientRepo.save(odil);
		
		List<Patient> patientsMich = new ArrayList<Patient>();
		patientsMich.add(michel);
		patientsMich.add(odil);		
		
		Utilisateur michelUser = new Utilisateur();
		michelUser.setEmail("michel.bilal@bean.fr");
		michelUser.setMotDePasse("jadoreDaniel");
		michelUser.setType(Type.PATIENT);
		michelUser.setPatients(patientsMich);
		
		michelUser = utilisateurRepo.save(michelUser);
			
		Specialite coloscopeur = new Specialite();
		coloscopeur.setNom("coloscopeur");
		
		coloscopeur = specialiteRepo.save(coloscopeur);
		
		Specialite oncologue = new Specialite();
		oncologue.setNom("oncologue");
		
		oncologue = specialiteRepo.save(oncologue);
		
		List<Specialite> spePhilippe = new ArrayList<Specialite>();
		
		Praticien philippe = new Praticien();
		philippe.setCivilite(Civilite.M);
		philippe.setNom("MEDECIN");
		philippe.setPrenom("Philippe");
		philippe.setTelephone("0612345678");
		philippe.setDureeCreneau(15);
		philippe.setSpecialites(spePhilippe);
		
		philippe = praticienRepo.save(philippe);
		
		Utilisateur philippeUser = new Utilisateur();
		philippeUser.setEmail("michel.bilal@bean.fr");
		philippeUser.setMotDePasse("jadoreDaniel");
		philippeUser.setType(Type.PATIENT);
		philippeUser.setPraticien(philippe);
		
		philippeUser = utilisateurRepo.save(philippeUser);
		
		Adresse adrPhilippe1 = new Adresse();

		adrPhilippe1.setVoie("5 avenue du grand rond");
		adrPhilippe1.setComplement("Résidence Jevousoigne");
		adrPhilippe1.setCodePostale("Un milliard");
		adrPhilippe1.setVille("Medicatown");
		
		
		Adresse adrPhilippe2 = new Adresse();

		adrPhilippe2.setVoie("15 rue des poules");
		adrPhilippe2.setComplement("Hopital Iban");
		adrPhilippe2.setCodePostale("78400");
		adrPhilippe2.setVille("Pansement-City");
		
		
		Lieu hopitalIban = new Lieu();
		hopitalIban.setAdresse(adrPhilippe2);
		hopitalIban.setNom("Hopital Iban");
		hopitalIban.setPraticien(philippe);
		
		hopitalIban = lieuRepo.save(hopitalIban);
		
		Lieu resJeVousSoigne = new Lieu();
		hopitalIban.setAdresse(adrPhilippe1);
		hopitalIban.setNom("Résidence Jevousoigne");
		hopitalIban.setPraticien(philippe);
		
		resJeVousSoigne = lieuRepo.save(resJeVousSoigne);
		
		Motif motif1 = new Motif();
		motif1.setConsultations(null);
		motif1.setNbCreneau(3);
		motif1.setNom("Cancer du cul");
		motif1.setSpecialite(oncologue);
		
		motif1 = motifRepo.save(motif1);
		
		
		Creneau creneau = new Creneau();
		creneau.setDebut(LocalDateTime.now());
		creneau.setDuree(3);
		creneau.setDispo(true);
		creneau.setLieu(hopitalIban);
		creneau.setPraticien(philippe);
		
		creneau = creneauRepo.save(creneau);

		List<Creneau> creneaux = new ArrayList<Creneau>();
		creneaux.add(creneau);
		
		Consultation consult1 = new Consultation();
		consult1.setCreneaux(creneaux);
		consult1.setMotif(motif1);
		consult1.setPatient(michel);
		
		consult1 = consultationRepo.save(consult1);
		
		List<Consultation> consultPhilippe = new ArrayList<Consultation>();
		consultPhilippe.add(consult1);
		
		
		spring.close();
	}

}
