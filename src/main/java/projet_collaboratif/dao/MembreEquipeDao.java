package projet_collaboratif.dao;

import java.util.List;

import javax.persistence.NamedQuery;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import projet_collaboratif.modele.Equipe;
import projet_collaboratif.modele.MembreEquipe;
import projet_collaboratif.modele.Personne;
import projet_collaboratif.modele.Projet;

public interface MembreEquipeDao extends CrudRepository<MembreEquipe, Integer>  {
	
	@Query(value ="SELECT p FROM MembreEquipe p WHERE p.idProjet = :idprojet and p.idPesrsonne = :idpersonne ", nativeQuery=true)
	public List<MembreEquipe>  findByIdProjetAndIdEquipe (@Param("idprojet") Integer idProjet,@Param("idpersonne") Integer idPersonne); 	 
	
	
	
	
}
