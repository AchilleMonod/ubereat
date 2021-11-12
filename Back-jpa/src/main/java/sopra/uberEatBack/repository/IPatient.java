package sopra.doctolib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.doctolib.model.Patient;

public interface IPatient extends JpaRepository<Patient, Long> {

}
