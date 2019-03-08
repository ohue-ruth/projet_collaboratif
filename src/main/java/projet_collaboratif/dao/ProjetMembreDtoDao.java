package projet_collaboratif.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import projet_collaboratif.modele.Projet;
import projet_collaboratif.modele.ProjetMembreDto;

public interface ProjetMembreDtoDao extends CrudRepository<Projet, Integer> {

	/** projets triés par session et par date  de fin */
	@Query(value = "SELECT pr.id_projet, COUNT(DISTINCT toutes_equipes.id_equipe) nb_equipes, :idPersonne, me_etudiant.id_equipe FROM projet pr LEFT JOIN membre_equipe toutes_equipes ON pr.id_projet = toutes_equipes.id_projet LEFT JOIN membre_equipe me_etudiant ON pr.id_projet = me_etudiant.id_projet WHERE pr.date_fin > NOW() AND pr.id_promotion IN ( SELECT id_promotion FROM membre_promotion WHERE id_personne = :idPersonne ) AND me_etudiant.id_personne = :idPersonne", nativeQuery = true)
	public ArrayList<ProjetMembreDto> findByIdPersonneNative(@Param("idPersonne") Integer idPersonne);

}

	//SELECT pr.id_projet, COUNT(DISTINCT toutes_equipes.id_equipe) nb_equipes, :idPersonne, me_etudiant.id_equipe FROM projet pr LEFT JOIN membre_equipe toutes_equipes ON pr.id_projet = toutes_equipes.id_projet LEFT JOIN membre_equipe me_etudiant ON pr.id_projet = me_etudiant.id_projet WHERE pr.date_fin > NOW() AND pr.id_promotion IN ( SELECT id_promotion FROM membre_promotion WHERE id_personne = :idPersonne ) AND me_etudiant.id_personne = :idPersonne
	  

//	SELECT 
//	pr.id_projet, 
//    COUNT(DISTINCT toutes_equipes.id_equipe),
//	4,
//    me_etudiant.id_equipe
//FROM
//	projet pr
//		LEFT JOIN 
//	membre_equipe toutes_equipes ON pr.id_projet = toutes_equipes.id_projet
//		LEFT JOIN
//	membre_equipe me_etudiant ON pr.id_projet = me_etudiant.id_projet AND me_etudiant.id_personne=4
//WHERE 
//	pr.date_fin > NOW()
//		AND
//	-- projets des promotions de l'etudiant
//	pr.id_promotion IN 
//	(
//		SELECT id_promotion
//		FROM membre_promotion
//		WHERE id_personne = 4
//	)
//GROUP BY pr.id_projet, me_etudiant.id_equipe

	
//	SELECT new projet_collaboratif.modele.ProjetMembreDto() from projet join (SELECT idProj, COUNT(idEq) nbEquipe from (SELECT projetPromotion.id_projet idProj, membreEq.id_equipe idEq from membre_equipe membreEq RIGHT JOIN ( Select * from projet where id_promotion IN (SELECT id_promotion from membre_promotion where id_personne = 4) and date_fin > now()) projetPromotion" + 
//			"on membreEq.id_projet = projetPromotion.id_projet" + 
//			"GROUP BY projetPromotion.id_projet, membreEq.id_equipe) tbMembreEq" + 
//			"GROUP BY idProj) proj " + 
//			"on projet.id_projet = proj.idProj


