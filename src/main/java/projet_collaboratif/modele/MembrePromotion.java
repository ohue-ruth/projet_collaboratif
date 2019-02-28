// Generated with g9.

package projet_collaboratif.modele;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="membre_promotion")
public class MembrePromotion implements Serializable {

    /** Primary key. */
    protected static final String PK = "MembrePromotionPrimary";

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

    @ManyToOne(optional=false)
    @JoinColumn(name="id_personne", nullable=false)
    private Personne personne;
    @ManyToOne(optional=false)
    @JoinColumn(name="id_promotion", nullable=false)
    private Promotion promotion;

    /** Default constructor. */
    public MembrePromotion() {
        super();
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

    /** Temporary value holder for group key fragment promotionIdPromotion */
    private transient int tempPromotionIdPromotion;

    /**
     * Gets the key fragment idPromotion for member promotion.
     * If this.promotion is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setPromotionIdPromotion.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Promotion
     */
    public int getPromotionIdPromotion() {
        return (getPromotion() == null ? tempPromotionIdPromotion : getPromotion().getIdPromotion());
    }

    /**
     * Sets the key fragment idPromotion from member promotion.
     * If this.promotion is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getPromotionIdPromotion.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIdPromotion New value for the key fragment
     * @see Promotion
     */
    public void setPromotionIdPromotion(int aIdPromotion) {
        if (getPromotion() == null) {
            tempPromotionIdPromotion = aIdPromotion;
        } else {
            getPromotion().setIdPromotion(aIdPromotion);
        }
    }

    /**
     * Compares the key for this instance with another MembrePromotion.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class MembrePromotion and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof MembrePromotion)) {
            return false;
        }
        MembrePromotion that = (MembrePromotion) other;
        if (this.getPersonneIdPersonne() != that.getPersonneIdPersonne()) {
            return false;
        }
        if (this.getPromotionIdPromotion() != that.getPromotionIdPromotion()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another MembrePromotion.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof MembrePromotion)) return false;
        return this.equalKeys(other) && ((MembrePromotion)other).equalKeys(this);
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
        i = getPersonneIdPersonne();
        result = 37*result + i;
        i = getPromotionIdPromotion();
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
        StringBuffer sb = new StringBuffer("[MembrePromotion |");
        sb.append(" personneIdPersonne=").append(getPersonneIdPersonne());
        sb.append(" promotionIdPromotion=").append(getPromotionIdPromotion());
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
        ret.put("personneIdPersonne", Integer.valueOf(getPersonneIdPersonne()));
        ret.put("promotionIdPromotion", Integer.valueOf(getPromotionIdPromotion()));
        return ret;
    }

}
