package projet_collaboratif.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import projet_collaboratif.modele.Personne;
import projet_collaboratif.modele.Projet;

public interface ProjetService {
	public List<Projet> findByIdProjet(@Param("idprojet") Integer idProjet);
}
