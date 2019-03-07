package projet_collaboratif.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projet_collaboratif.dao.EquipeDao;
import projet_collaboratif.modele.Equipe;
@Service
public class EquipeServiceImp implements EquipeService{
@Autowired
		private EquipeDao equipeDao;
	@Override
	public boolean addEquipe(Equipe equipe) {
		
		equipeDao.save(equipe);
		return true;
	}

}
