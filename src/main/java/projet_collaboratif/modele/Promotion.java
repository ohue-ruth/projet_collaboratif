// Generated with g9.

package projet_collaboratif.modele;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="promotion", indexes={@Index(name="promotion_nom_IX", columnList="nom", unique=true)})
public class Promotion implements Serializable {

    /** Primary key. */
    protected static final String PK = "idPromotion";

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
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_promotion", unique=true, nullable=false, precision=10)
    private int idPromotion;
    @Column(unique=true, nullable=false, length=45)
    private String nom;
    @Column(name="date_debut", nullable=false)
    private Date dateDebut;
    @Column(name="date_fin", nullable=false)
    private Date dateFin;
    @OneToMany(mappedBy="promotion")
    private Set<MembrePromotion> membrePromotion;
    @OneToMany(mappedBy="promotion")
    private Set<Projet> projet;

    /** Default constructor. */
    public Promotion() {
        super();
    }

    /**
     * Access method for idPromotion.
     *
     * @return the current value of idPromotion
     */
    public int getIdPromotion() {
        return idPromotion;
    }

    /**
     * Setter method for idPromotion.
     *
     * @param aIdPromotion the new value for idPromotion
     */
    public void setIdPromotion(int aIdPromotion) {
        idPromotion = aIdPromotion;
    }

    /**
     * Access method for nom.
     *
     * @return the current value of nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter method for nom.
     *
     * @param aNom the new value for nom
     */
    public void setNom(String aNom) {
        nom = aNom;
    }

    /**
     * Access method for dateDebut.
     *
     * @return the current value of dateDebut
     */
    public Date getDateDebut() {
        return dateDebut;
    }

    /**
     * Setter method for dateDebut.
     *
     * @param aDateDebut the new value for dateDebut
     */
    public void setDateDebut(Date aDateDebut) {
        dateDebut = aDateDebut;
    }

    /**
     * Access method for dateFin.
     *
     * @return the current value of dateFin
     */
    public Date getDateFin() {
        return dateFin;
    }

    /**
     * Setter method for dateFin.
     *
     * @param aDateFin the new value for dateFin
     */
    public void setDateFin(Date aDateFin) {
        dateFin = aDateFin;
    }

    /**
     * Access method for membrePromotion.
     *
     * @return the current value of membrePromotion
     */
    public Set<MembrePromotion> getMembrePromotion() {
        return membrePromotion;
    }

    /**
     * Setter method for membrePromotion.
     *
     * @param aMembrePromotion the new value for membrePromotion
     */
    public void setMembrePromotion(Set<MembrePromotion> aMembrePromotion) {
        membrePromotion = aMembrePromotion;
    }

    /**
     * Access method for projet.
     *
     * @return the current value of projet
     */
    public Set<Projet> getProjet() {
        return projet;
    }

    /**
     * Setter method for projet.
     *
     * @param aProjet the new value for projet
     */
    public void setProjet(Set<Projet> aProjet) {
        projet = aProjet;
    }

    /**
     * Compares the key for this instance with another Promotion.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Promotion and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Promotion)) {
            return false;
        }
        Promotion that = (Promotion) other;
        if (this.getIdPromotion() != that.getIdPromotion()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Promotion.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Promotion)) return false;
        return this.equalKeys(other) && ((Promotion)other).equalKeys(this);
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
        i = getIdPromotion();
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
        StringBuffer sb = new StringBuffer("[Promotion |");
        sb.append(" idPromotion=").append(getIdPromotion());
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
        ret.put("idPromotion", Integer.valueOf(getIdPromotion()));
        return ret;
    }

}
