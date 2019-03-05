package projet_collaboratif.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import projet_collaboratif.modele.Personne;
import projet_collaboratif.modele.Projet;

public interface ProjetDao extends CrudRepository<Projet, Integer>  {
	@Query("select p from projet p where p.idProjet = :idprojet and date_fin > CURRENT_TIMESTAMP")
	public List<Projet> findByIdProjet(@Param("idprojet") Integer idProjet);
}
