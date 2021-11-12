package sopra.doctolib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.doctolib.model.Utilisateur;


public interface IUtilisateur extends JpaRepository<Utilisateur, Long> {

}
