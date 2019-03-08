package projet_collaboratif.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import projet_collaboratif.dao.EquipeDao;
import projet_collaboratif.modele.Equipe;
import projet_collaboratif.modele.Personne;

public interface EquipeService {
	
	public void addEquipe(Equipe equipe);
	public Optional<Equipe> findById(int idEquipe);
	
}
