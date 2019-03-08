package projet_collaboratif.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import projet_collaboratif.modele.Projet;
import projet_collaboratif.modele.ProjetMembreDto;

/*public interface ProjetMembreDtoDao extends CrudRepository<ProjetMembreDto, Integer> {

	/* projets triés par session et par date  de fin 
	@Query(value = "Select new projet_collaboratif.modele.ProjetMembreDto(u.id, u.name) from membre_equipe ", nativeQuery = true)
	public ArrayList<ProjetMembreDto> findByIdPersonneNative(@Param("idPersonne") Integer idPersonne);
	
	//SELECT * from membre_promotion where id_personne = 8
	//Select id_projet from projet where id_promotion IN (SELECT id_promotion from membre_promotion where id_personne = 8) and date_fin > now();

SELECT * from membre_equipe membreEq RIGHT JOIN ( Select * from projet where id_promotion IN (SELECT id_promotion from membre_promotion where id_personne = 8) and date_fin > now()) projetPromotion
on membreEq.id_projet = projetPromotion.id_projet
where id_personne = 4

SELECT projetPromotion.id_projet, membreEq.id_equipe from membre_equipe membreEq RIGHT JOIN ( Select * from projet where id_promotion IN (SELECT id_promotion from membre_promotion where id_personne = 4) and date_fin > now()) projetPromotion
on membreEq.id_projet = projetPromotion.id_projet
group by projetPromotion.id_projet, membreEq.id_equipe
}*/
