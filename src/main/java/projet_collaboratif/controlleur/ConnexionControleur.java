package projet_collaboratif.controlleur;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import projet_collaboratif.modele.Personne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Controller;

@Controller
public class ConnexionControleur {

	@RequestMapping("/")
	public String index() {
		return "connexion";
	}

	@RequestMapping(value = "/connexion", method = RequestMethod.POST)
	public String getByLoginPassword(@RequestParam(value="email") String email,
			@RequestParam(value="motPasse") String motPasse) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("projet_collaboratif");
		EntityManager em = factory.createEntityManager();
		TypedQuery<Personne> query =
			      em.createQuery("Personne.findByLoginPassword", Personne.class);
		Personne result = query.setParameter("email", email)
				.setParameter("motPasse", motPasse)
				.getSingleResult();
		if (result!=null)
		 {
			return "etudiant.html";
		 }
		return "aide.html";
		
	}

}
