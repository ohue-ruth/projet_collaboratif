package projet_collaboratif.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projet_collaboratif.dao.EquipeDao;
import projet_collaboratif.modele.Equipe;
import projet_collaboratif.modele.Personne;
@Service
public class EquipeServiceImp implements EquipeService{
@Autowired
private EquipeDao equipeDao;
	@Override
	public void addEquipe(Equipe equipe) {
		
		equipeDao.save(equipe);
		
	}
	@Override
	public Optional<Equipe> findById(int idEquipe) {
		
		return equipeDao.findById(idEquipe);
	}
	
	
	
	
	

}

