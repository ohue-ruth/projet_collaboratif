package projet_collaboratif.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import projet_collaboratif.modele.Personne;

public interface PersonneDao extends CrudRepository<Personne, Integer> {
	// List<Personne> findByLastName(String lastName);
	public Personne  findByEmailAndMotPasse(String email, String motPasse); 
	public Personne  findByIdPersonne(Integer idPersonne);

	// List<Personne> findByFirstName(String surname);
	// @Transactional
	// List<Personne> removeByLastName(String lastname);
	//@Query("select p from Customer p where p.email = ?1 and p.mot_passe = ?2")
	//List<Personne> findByEmailAndMotPasse(String email, String motPasse);findByEmailAndMotPasse(String email, String motPasse);
}