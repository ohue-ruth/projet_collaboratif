// Generated with g9.

package projet_collaboratif.modele;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="projet")
public class Projet implements Serializable {

    /** Primary key. */
    protected static final String PK = "idProjet";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
//    @Version
//    @Column(name="LOCK_FLAG")
//    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
//    public Integer getLockFlag() {
//        return lockFlag;
//    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
//    public void setLockFlag(Integer aLockFlag) {
//        lockFlag = aLockFlag;
//    }

    @Id
    @Column(name="id_projet", unique=true, nullable=false, precision=10)
    private int idProjet;
    @Column(nullable=false, length=45)
    private String titre;
    @Column(name="date_creation")
    private Timestamp dateCreation;
    @Column(name="date_fin")
    private Timestamp dateFin;
    private String sujet;
    @OneToMany(mappedBy="projet")
    private Set<MembreEquipe> membreEquipe;
    @ManyToOne(optional=false)
    @JoinColumn(name="id_formateur", nullable=false)
    private Personne personne;
    @ManyToOne(optional=false)
    @JoinColumn(name="id_promotion", nullable=false)
    private Promotion promotion;

    /** Default constructor. */
    public Projet() {
        super();
    }

    /**
     * Access method for idProjet.
     *
     * @return the current value of idProjet
     */
    public int getIdProjet() {
        return idProjet;
    }

    /**
     * Setter method for idProjet.
     *
     * @param aIdProjet the new value for idProjet
     */
    public void setIdProjet(int aIdProjet) {
        idProjet = aIdProjet;
    }

    /**
     * Access method for titre.
     *
     * @return the current value of titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Setter method for titre.
     *
     * @param aTitre the new value for titre
     */
    public void setTitre(String aTitre) {
        titre = aTitre;
    }

    /**
     * Access method for dateCreation.
     *
     * @return the current value of dateCreation
     */
    public Timestamp getDateCreation() {
        return dateCreation;
    }

    /**
     * Setter method for dateCreation.
     *
     * @param aDateCreation the new value for dateCreation
     */
    public void setDateCreation(Timestamp aDateCreation) {
        dateCreation = aDateCreation;
    }

    /**
     * Access method for dateFin.
     *
     * @return the current value of dateFin
     */
    public Timestamp getDateFin() {
        return dateFin;
    }

    /**
     * Setter method for dateFin.
     *
     * @param aDateFin the new value for dateFin
     */
    public void setDateFin(Timestamp aDateFin) {
        dateFin = aDateFin;
    }

    /**
     * Access method for sujet.
     *
     * @return the current value of sujet
     */
    public String getSujet() {
        return sujet;
    }

    /**
     * Setter method for sujet.
     *
     * @param aSujet the new value for sujet
     */
    public void setSujet(String aSujet) {
        sujet = aSujet;
    }

    /**
     * Access method for membreEquipe.
     *
     * @return the current value of membreEquipe
     */
    public Set<MembreEquipe> getMembreEquipe() {
        return membreEquipe;
    }

    /**
     * Setter method for membreEquipe.
     *
     * @param aMembreEquipe the new value for membreEquipe
     */
    public void setMembreEquipe(Set<MembreEquipe> aMembreEquipe) {
        membreEquipe = aMembreEquipe;
    }

    /**
     * Access method for personne.
     *
     * @return the current value of personne
     */
    public Personne getPersonne() {
        return personne;
    }

    /**
     * Setter method for personne.
     *
     * @param aPersonne the new value for personne
     */
    public void setPersonne(Personne aPersonne) {
        personne = aPersonne;
    }

    /**
     * Access method for promotion.
     *
     * @return the current value of promotion
     */
    public Promotion getPromotion() {
        return promotion;
    }

    /**
     * Setter method for promotion.
     *
     * @param aPromotion the new value for promotion
     */
    public void setPromotion(Promotion aPromotion) {
        promotion = aPromotion;
    }

    /**
     * Compares the key for this instance with another Projet.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Projet and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Projet)) {
            return false;
        }
        Projet that = (Projet) other;
        if (this.getIdProjet() != that.getIdProjet()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Projet.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Projet)) return false;
        return this.equalKeys(other) && ((Projet)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getIdProjet();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Projet |");
        sb.append(" idProjet=").append(getIdProjet());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("idProjet", Integer.valueOf(getIdProjet()));
        return ret;
    }

}
