package sopra.doctolib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.doctolib.model.Consultation;


public interface IConsultation extends JpaRepository<Consultation, Long> {

}
