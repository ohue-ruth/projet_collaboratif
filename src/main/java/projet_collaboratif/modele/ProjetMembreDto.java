package projet_collaboratif.modele;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import projet_collaboratif.dao.EquipeDao;
import projet_collaboratif.dao.PersonneDao;
import projet_collaboratif.dao.ProjetDao;

/**
 * Projet affecté à un membre (à une de ses sessions de formation). Si le membre
 * n'est dans aucune équipe, getEquipe() vaut null.
 * 
 * @author fcd
 *
 */
public class ProjetMembreDto {

	private Projet projet;
	private int nbEquipes;
	private int idMembre;

	/** Null si dans aucune equipe */
	private Equipe equipeDuMembre;

//	public ProjetMembreDto(Projet projet, int nbEquipes, int idMembre,
//			Equipe equipeDuMembre) {
//		this.projet = projet;
//		this.nbEquipes = nbEquipes;
//		this.idMembre = idMembre;
//		this.equipeDuMembre = equipeDuMembre;
//	}

	@Autowired
	ProjetDao projetDao;

	@Autowired
	EquipeDao equipeDao;

	public ProjetMembreDto(int idProjet, int nbEquipes, int idMembre, Integer idEquipeDuMembre) {

		this.projet = projetDao.findByIdProjet(idProjet);
		this.nbEquipes = nbEquipes;
		this.idMembre = idMembre;
		if (idEquipeDuMembre != null) {
			this.equipeDuMembre = equipeDao.findByIdEquipe(idEquipeDuMembre);
		}
	}

	public Projet getProjet() {
		return projet;
	}

	public int getNbEquipes() {
		return nbEquipes;
	}

	public int getIdMembre() {
		return idMembre;
	}

	public Equipe getEquipeDuMembre() {
		return equipeDuMembre;
	}

	// Il faudrait ensuite ajouter
//	private int nbEtudiantsNonAffectes;

//	/** projets triés par session et par date  de fin */
//	@Query
//	private ArrayList<ProjetMembre> findByIdPersonne(int idPersonne) {
//		return null;
//	}
//	
}
