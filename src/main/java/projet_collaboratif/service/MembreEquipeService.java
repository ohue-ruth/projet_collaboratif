package projet_collaboratif.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import projet_collaboratif.modele.MembreEquipe;


public interface MembreEquipeService {
	public List<MembreEquipe>  findByIdProjetAndIdEquipe (@Param("idprojet")Integer idProjet,@Param("idequipe") Integer idEquipe); 	 
	

}

