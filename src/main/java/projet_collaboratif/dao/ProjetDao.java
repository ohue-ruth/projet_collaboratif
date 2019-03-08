package projet_collaboratif.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import projet_collaboratif.modele.Personne;
import projet_collaboratif.modele.Projet;
import projet_collaboratif.modele.ProjetMembreDto;

public interface ProjetDao extends CrudRepository<Projet, Integer>  {
	//@Query("select * from projet where projet.id_promotion = :idPromotion and date_fin > CURRENT_TIMESTAMP")
	@Query(value = "select * from projet where projet.id_promotion = :idPromotion and date_fin > now()", nativeQuery = true)
	public ArrayList<Projet> findProjetsByIdPromotionNative(@Param("idPromotion") Integer idPromotion);
	
	public Projet findByIdProjet(Integer IdProjet);
	
	@Query(value = "SELECT new projet_collaboratif.modele.ProjetMembreDto(pr.id_projet, COUNT(DISTINCT toutes_equipes.id_equipe) nb_equipes, :idPersonne, me_etudiant.id_equipe) FROM projet pr LEFT JOIN membre_equipe toutes_equipes ON pr.id_projet = toutes_equipes.id_projet LEFT JOIN membre_equipe me_etudiant ON pr.id_projet = me_etudiant.id_projet WHERE pr.date_fin > NOW() AND pr.id_promotion IN ( SELECT id_promotion FROM membre_promotion WHERE id_personne = :idPersonne ) AND me_etudiant.id_personne = :idPersonne", nativeQuery = true)
	public ArrayList<ProjetMembreDto> findByIdPersonneNative(@Param("idPersonne") Integer idPersonne);

//	@Query(value = "SELECT mep FROM membre_promotion mep where mep.idPersonne = :idPersonne")
//	public ArrayList<ProjetMembreDto> findByIdPersonne(@Param("idPersonne") Integer idPersonne);
	
}
