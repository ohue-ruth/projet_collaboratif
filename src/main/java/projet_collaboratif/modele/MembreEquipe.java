// Generated with g9.

package projet_collaboratif.modele;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="membre_equipe", indexes={@Index(name="membreEquipeUniqueProjetPersonne", columnList="id_projet,id_personne", unique=true)})

public class MembreEquipe implements Serializable {
    @EmbeddedId
    private MembreEquipeCle cle;

    /** Primary key. */
    protected static final String PK = "MembreEquipePrimary";

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

    @MapsId("idEquipe")
    @ManyToOne(optional=false)
    @JoinColumn(name="id_equipe", nullable=false)
    private Equipe equipe;
    
    @MapsId("idPersonne")
    @ManyToOne(optional=false)
    @JoinColumn(name="id_personne", nullable=false)
    private Personne personne;
    
    @MapsId("idProjet")
    @ManyToOne(optional=false)
    @JoinColumn(name="id_projet", nullable=false)
    private Projet projet;

    /** Default constructor. */
    public MembreEquipe() {
        super();
    }

    /**
     * Access method for equipe.
     *
     * @return the current value of equipe
     */
    public Equipe getEquipe() {
        return equipe;
    }

    /**
     * Setter method for equipe.
     *
     * @param aEquipe the new value for equipe
     */
    public void setEquipe(Equipe aEquipe) {
        equipe = aEquipe;
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
     * Access method for projet.
     *
     * @return the current value of projet
     */
    public Projet getProjet() {
        return projet;
    }

    /**
     * Setter method for projet.
     *
     * @param aProjet the new value for projet
     */
    public void setProjet(Projet aProjet) {
        projet = aProjet;
    }

    /** Temporary value holder for group key fragment projetIdProjet */
    private transient int tempProjetIdProjet;

    /**
     * Gets the key fragment idProjet for member projet.
     * If this.projet is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setProjetIdProjet.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Projet
     */
    public int getProjetIdProjet() {
        return (getProjet() == null ? tempProjetIdProjet : getProjet().getIdProjet());
    }

    /**
     * Sets the key fragment idProjet from member projet.
     * If this.projet is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getProjetIdProjet.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIdProjet New value for the key fragment
     * @see Projet
     */
    public void setProjetIdProjet(int aIdProjet) {
        if (getProjet() == null) {
            tempProjetIdProjet = aIdProjet;
        } else {
            getProjet().setIdProjet(aIdProjet);
        }
    }

    /** Temporary value holder for group key fragment equipeIdEquipe */
    private transient int tempEquipeIdEquipe;

    /**
     * Gets the key fragment idEquipe for member equipe.
     * If this.equipe is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEquipeIdEquipe.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Equipe
     */
    public int getEquipeIdEquipe() {
        return (getEquipe() == null ? tempEquipeIdEquipe : getEquipe().getIdEquipe());
    }

    /**
     * Sets the key fragment idEquipe from member equipe.
     * If this.equipe is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEquipeIdEquipe.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIdEquipe New value for the key fragment
     * @see Equipe
     */
    public void setEquipeIdEquipe(int aIdEquipe) {
        if (getEquipe() == null) {
            tempEquipeIdEquipe = aIdEquipe;
        } else {
            getEquipe().setIdEquipe(aIdEquipe);
        }
    }

    /** Temporary value holder for group key fragment personneIdPersonne */
    private transient int tempPersonneIdPersonne;

    /**
     * Gets the key fragment idPersonne for member personne.
     * If this.personne is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setPersonneIdPersonne.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Personne
     */
    public int getPersonneIdPersonne() {
        return (getPersonne() == null ? tempPersonneIdPersonne : getPersonne().getIdPersonne());
    }

    /**
     * Sets the key fragment idPersonne from member personne.
     * If this.personne is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getPersonneIdPersonne.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIdPersonne New value for the key fragment
     * @see Personne
     */
    public void setPersonneIdPersonne(int aIdPersonne) {
        if (getPersonne() == null) {
            tempPersonneIdPersonne = aIdPersonne;
        } else {
            getPersonne().setIdPersonne(aIdPersonne);
        }
    }

    /**
     * Compares the key for this instance with another MembreEquipe.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class MembreEquipe and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof MembreEquipe)) {
            return false;
        }
        MembreEquipe that = (MembreEquipe) other;
        if (this.getProjetIdProjet() != that.getProjetIdProjet()) {
            return false;
        }
        if (this.getEquipeIdEquipe() != that.getEquipeIdEquipe()) {
            return false;
        }
        if (this.getPersonneIdPersonne() != that.getPersonneIdPersonne()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another MembreEquipe.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof MembreEquipe)) return false;
        return this.equalKeys(other) && ((MembreEquipe)other).equalKeys(this);
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
        i = getProjetIdProjet();
        result = 37*result + i;
        i = getEquipeIdEquipe();
        result = 37*result + i;
        i = getPersonneIdPersonne();
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
        StringBuffer sb = new StringBuffer("[MembreEquipe |");
        sb.append(" projetIdProjet=").append(getProjetIdProjet());
        sb.append(" equipeIdEquipe=").append(getEquipeIdEquipe());
        sb.append(" personneIdPersonne=").append(getPersonneIdPersonne());
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
        ret.put("projetIdProjet", Integer.valueOf(getProjetIdProjet()));
        ret.put("equipeIdEquipe", Integer.valueOf(getEquipeIdEquipe()));
        ret.put("personneIdPersonne", Integer.valueOf(getPersonneIdPersonne()));
        return ret;
    }

}
