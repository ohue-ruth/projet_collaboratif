package projet_collaboratif.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import projet_collaboratif.dao.PersonneDao;
import projet_collaboratif.dao.ProjetDao;
import projet_collaboratif.modele.Personne;
import projet_collaboratif.modele.Projet;

@Service("projetService")
@Transactional
public class ProjetServiceImpl implements ProjetService {
	@Autowired
	private ProjetDao projetDao;

	@Override
	public ArrayList<Projet> findProjetsByIdPromotionNative(Integer idPromotion){

		return projetDao.findProjetsByIdPromotionNative(idPromotion);
	}
}
