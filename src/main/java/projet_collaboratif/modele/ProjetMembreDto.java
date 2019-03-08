package projet_collaboratif.modele;

import java.util.ArrayList;

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

	public ProjetMembreDto(Projet projet, int nbEquipes, int idMembre,
			Equipe equipeDuMembre) {
		this.projet = projet;
		this.nbEquipes = nbEquipes;
		this.idMembre = idMembre;
		this.equipeDuMembre = equipeDuMembre;
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
