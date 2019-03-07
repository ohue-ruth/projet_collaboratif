package projet_collaboratif.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.query.Param;

import projet_collaboratif.modele.Personne;
import projet_collaboratif.modele.Projet;

public interface ProjetService {
	public ArrayList<Projet> findProjetsByIdPromotionNative(Integer idPromotion);
}
