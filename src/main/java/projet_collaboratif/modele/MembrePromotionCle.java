package projet_collaboratif.modele;

import java.io.Serializable;

import javax.persistence.Column;

public class MembrePromotionCle implements Serializable {

	@Column(name = "id_personne", nullable = false)
	private int idPersonne;

	@Column(name = "id_promotion", nullable = false)
	private int idPromotion;

	public int getIdPersonne() {
		return idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	public int getIdPromotion() {
		return idPromotion;
	}

	public void setIdPromotion(int idPromotion) {
		this.idPromotion = idPromotion;
	}

}
