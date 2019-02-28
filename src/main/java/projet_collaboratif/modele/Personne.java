// Generated with g9.

package projet_collaboratif.modele;

import java.io.Serializable;
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
@Table(name="personne", indexes={@Index(name="personne_email_IX", columnList="email", unique=true)})
public class Personne implements Serializable {

    /** Primary key. */
    protected static final String PK = "idPersonne";

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
    @Column(name="id_personne", unique=true, nullable=false, precision=10)
    private int idPersonne;
    @Column(nullable=false, length=45)
    private String nom;
    @Column(nullable=false, length=45)
    private String prenom;
    @Column(length=45)
    private String adresse;
    @Column(name="code_postal", length=45)
    private String codePostal;
    @Column(length=45)
    private String ville;
    @Column(length=45)
    private String tel;
    @Column(name="mot_passe", nullable=false, length=255)
    private String motPasse;
    @Column(unique=true, nullable=false, length=255)
    private String email;
    @Column(name="est_formateur", nullable=false, precision=3)
    private short estFormateur;
    @Column(name="est_gestionnaire", nullable=false, precision=3)
    private short estGestionnaire;
    @OneToMany(mappedBy="personne")
    private Set<Equipe> equipe;
    @OneToMany(mappedBy="personne")
    private Set<MembrePromotion> membrePromotion;
    @OneToMany(mappedBy="personne")
    private Set<MembreEquipe> membreEquipe;
    @OneToMany(mappedBy="personne")
    private Set<Projet> projet;

    /** Default constructor. */
    public Personne() {
        super();
    }

    /**
     * Access method for idPersonne.
     *
     * @return the current value of idPersonne
     */
    public int getIdPersonne() {
        return idPersonne;
    }

    /**
     * Setter method for idPersonne.
     *
     * @param aIdPersonne the new value for idPersonne
     */
    public void setIdPersonne(int aIdPersonne) {
        idPersonne = aIdPersonne;
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
     * Access method for prenom.
     *
     * @return the current value of prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Setter method for prenom.
     *
     * @param aPrenom the new value for prenom
     */
    public void setPrenom(String aPrenom) {
        prenom = aPrenom;
    }

    /**
     * Access method for adresse.
     *
     * @return the current value of adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Setter method for adresse.
     *
     * @param aAdresse the new value for adresse
     */
    public void setAdresse(String aAdresse) {
        adresse = aAdresse;
    }

    /**
     * Access method for codePostal.
     *
     * @return the current value of codePostal
     */
    public String getCodePostal() {
        return codePostal;
    }

    /**
     * Setter method for codePostal.
     *
     * @param aCodePostal the new value for codePostal
     */
    public void setCodePostal(String aCodePostal) {
        codePostal = aCodePostal;
    }

    /**
     * Access method for ville.
     *
     * @return the current value of ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * Setter method for ville.
     *
     * @param aVille the new value for ville
     */
    public void setVille(String aVille) {
        ville = aVille;
    }

    /**
     * Access method for tel.
     *
     * @return the current value of tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * Setter method for tel.
     *
     * @param aTel the new value for tel
     */
    public void setTel(String aTel) {
        tel = aTel;
    }

    /**
     * Access method for motPasse.
     *
     * @return the current value of motPasse
     */
    public String getMotPasse() {
        return motPasse;
    }

    /**
     * Setter method for motPasse.
     *
     * @param aMotPasse the new value for motPasse
     */
    public void setMotPasse(String aMotPasse) {
        motPasse = aMotPasse;
    }

    /**
     * Access method for email.
     *
     * @return the current value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for email.
     *
     * @param aEmail the new value for email
     */
    public void setEmail(String aEmail) {
        email = aEmail;
    }

    /**
     * Access method for estFormateur.
     *
     * @return the current value of estFormateur
     */
    public short getEstFormateur() {
        return estFormateur;
    }

    /**
     * Setter method for estFormateur.
     *
     * @param aEstFormateur the new value for estFormateur
     */
    public void setEstFormateur(short aEstFormateur) {
        estFormateur = aEstFormateur;
    }

    /**
     * Access method for estGestionnaire.
     *
     * @return the current value of estGestionnaire
     */
    public short getEstGestionnaire() {
        return estGestionnaire;
    }

    /**
     * Setter method for estGestionnaire.
     *
     * @param aEstGestionnaire the new value for estGestionnaire
     */
    public void setEstGestionnaire(short aEstGestionnaire) {
        estGestionnaire = aEstGestionnaire;
    }

    /**
     * Access method for equipe.
     *
     * @return the current value of equipe
     */
    public Set<Equipe> getEquipe() {
        return equipe;
    }

    /**
     * Setter method for equipe.
     *
     * @param aEquipe the new value for equipe
     */
    public void setEquipe(Set<Equipe> aEquipe) {
        equipe = aEquipe;
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
     * Compares the key for this instance with another Personne.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Personne and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Personne)) {
            return false;
        }
        Personne that = (Personne) other;
        if (this.getIdPersonne() != that.getIdPersonne()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Personne.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Personne)) return false;
        return this.equalKeys(other) && ((Personne)other).equalKeys(this);
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
        i = getIdPersonne();
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
        StringBuffer sb = new StringBuffer("[Personne |");
        sb.append(" idPersonne=").append(getIdPersonne());
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
        ret.put("idPersonne", Integer.valueOf(getIdPersonne()));
        return ret;
    }

}
