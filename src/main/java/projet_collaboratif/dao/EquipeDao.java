package projet_collaboratif.dao;

import org.springframework.data.repository.CrudRepository;

import projet_collaboratif.modele.Equipe;
import projet_collaboratif.modele.Projet;

public interface EquipeDao extends CrudRepository<Equipe, Integer> {
	public Equipe findByIdEquipe(Integer IdEquipe);
}
