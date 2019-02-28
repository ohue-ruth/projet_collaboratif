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

@Entity(name="equipe")
public class Equipe implements Serializable {

    /** Primary key. */
    protected static final String PK = "idEquipe";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @Column(name="id_equipe", unique=true, nullable=false, precision=10)
    private int idEquipe;
    @Column(nullable=false, length=45)
    private String libelle;
    @Column(name="date_creation", nullable=false)
    private Timestamp dateCreation;
    @Column(length=45)
    private String commentaire;
    @ManyToOne(optional=false)
    @JoinColumn(name="id_createur", nullable=false)
    private Personne personne;
    @OneToMany(mappedBy="equipe")
    private Set<MembreEquipe> membreEquipe;

    /** Default constructor. */
    public Equipe() {
        super();
    }

    /**
     * Access method for idEquipe.
     *
     * @return the current value of idEquipe
     */
    public int getIdEquipe() {
        return idEquipe;
    }

    /**
     * Setter method for idEquipe.
     *
     * @param aIdEquipe the new value for idEquipe
     */
    public void setIdEquipe(int aIdEquipe) {
        idEquipe = aIdEquipe;
    }

    /**
     * Access method for libelle.
     *
     * @return the current value of libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Setter method for libelle.
     *
     * @param aLibelle the new value for libelle
     */
    public void setLibelle(String aLibelle) {
        libelle = aLibelle;
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
     * Access method for commentaire.
     *
     * @return the current value of commentaire
     */
    public String getCommentaire() {
        return commentaire;
    }

    /**
     * Setter method for commentaire.
     *
     * @param aCommentaire the new value for commentaire
     */
    public void setCommentaire(String aCommentaire) {
        commentaire = aCommentaire;
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
     * Compares the key for this instance with another Equipe.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Equipe and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Equipe)) {
            return false;
        }
        Equipe that = (Equipe) other;
        if (this.getIdEquipe() != that.getIdEquipe()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Equipe.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Equipe)) return false;
        return this.equalKeys(other) && ((Equipe)other).equalKeys(this);
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
        i = getIdEquipe();
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
        StringBuffer sb = new StringBuffer("[Equipe |");
        sb.append(" idEquipe=").append(getIdEquipe());
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
        ret.put("idEquipe", Integer.valueOf(getIdEquipe()));
        return ret;
    }

}
