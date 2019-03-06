package projet_collaboratif.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import projet_collaboratif.dao.MembreEquipeDao;

import projet_collaboratif.modele.MembreEquipe;

@Service("membreEquipeService")
@Transactional
public class MembreEquipeServiceImp implements MembreEquipeService {
	@Autowired
	 private MembreEquipeDao membreEquipeDao;

	@Override
	public List<MembreEquipe> findByIdProjetAndIdEquipe(Integer idProjet, Integer idEquipe) {
		
		return membreEquipeDao.findByIdProjetAndIdEquipe(idProjet, idEquipe);
	}
	


}
