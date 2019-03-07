package projet_collaboratif.dao;

import org.springframework.data.repository.CrudRepository;

import projet_collaboratif.modele.Equipe;

public interface EquipeDao extends 
	CrudRepository<Equipe, Integer> {
}
