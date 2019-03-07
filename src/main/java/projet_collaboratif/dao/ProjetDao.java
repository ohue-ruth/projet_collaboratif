package projet_collaboratif.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import projet_collaboratif.modele.Personne;
import projet_collaboratif.modele.Projet;

public interface ProjetDao extends CrudRepository<Projet, Integer>  {
	//@Query("select * from projet where projet.id_promotion = :idPromotion and date_fin > CURRENT_TIMESTAMP")
	@Query(value = "select * from projet where projet.id_promotion = :idPromotion and date_fin > now()", nativeQuery = true)
	public ArrayList<Projet> findProjetsByIdPromotionNative(@Param("idPromotion") Integer idPromotion);
}
