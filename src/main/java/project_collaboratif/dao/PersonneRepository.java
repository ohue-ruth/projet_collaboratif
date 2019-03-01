package project_collaboratif.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import projet_collaboratif.modele.Personne;

public interface PersonneRepository extends CrudRepository<Personne, Integer> {
	// List<Personne> findByLastName(String lastName);

	// List<Personne> findByFirstName(String surname);
	// @Transactional
	// List<Personne> removeByLastName(String lastname);
	@Query("select p from Customer p where p.email = ?1 and p.mot_passe = ?2")
	List<Personne> findByEmailAndMotPasse(String email, String motPasse);
}