package projet_collaboratif.service;

import projet_collaboratif.modele.Personne;

public interface PersonneService {
	
	public Personne  findByEmailAndMotPasse(String email, String motPasse);
	public Personne  findByIdPersonne(Integer idPersonne);
}
