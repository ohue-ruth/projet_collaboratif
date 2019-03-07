package projet_collaboratif.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import projet_collaboratif.dao.PersonneDao;
import projet_collaboratif.modele.Personne;

@Service("personneService")
@Transactional
public class PersonneServiceImpl implements PersonneService {
	@Autowired
	private PersonneDao personneDao;

	@Override
	public Personne findByEmailAndMotPasse(String email, String motPasse) {

		return personneDao.findByEmailAndMotPasse(email, motPasse);
	}
	
	@Override
	public Personne  findByIdPersonne(Integer idPersonne) {
		return personneDao.findByIdPersonne(idPersonne);
	}

}
