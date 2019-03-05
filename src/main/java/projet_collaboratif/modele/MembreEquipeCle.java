package projet_collaboratif.modele;

import java.io.Serializable;

import javax.persistence.Column;

public class MembreEquipeCle implements Serializable {

    @Column(name = "id_personne", nullable = false)
    private int idPersonne;

    @Column(name = "id_equipe", nullable = false)
    private int idEquipe;
    @Column(name = "id_projet", nullable = false)
    private int idProjet;
    
	public int getIdPersonne() {
		return idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	public int getIdEquipe() {
		return idEquipe;
	}

	public void setIdEquipe(int idEquipe) {
		this.idEquipe = idEquipe;
	}
	public int getIdProjet() {
		return idProjet;
	}

	public void setIdProjet(int idProjet) {
		this.idProjet = idProjet;
	}

}