package projet_collaboratif.controlleur;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import projet_collaboratif.modele.Personne;
import projet_collaboratif.service.PersonneService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("connexion")
public class ConnexionControleur {
	
	@Autowired
	private PersonneService personneService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("personne", new Personne());
		return "connexion/index";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String authentifier(@ModelAttribute("personne") Personne personne, HttpSession session,
			ModelMap modelMap) {
		if(personneService.findByEmailAndMotPasse(personne.getEmail(), personne.getMotPasse()) == null) {
			//session.setAttribute("nomUtilisateur", personne.getNom());
			//session.setAttribute("prenomUtilisateur", personne.getPrenom());
			session.setAttribute("emailUtilisateur", personne.getEmail());
			return "connexion/index";
		}
		else {
			modelMap.put("msgConnexion","Compte non valide");
			return "connexion/index";
		}
	}

//	@RequestMapping(method = RequestMethod.POST)
//	public String getByLoginPassword(
//			HttpSession session, 
//			@RequestParam(value="email") String email,
//			@RequestParam(value="motPasse") String motPasse,
//			ModelMap map) {
//		String page = "index.html";
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
//		EntityManager em = factory.createEntityManager();
//		TypedQuery<Personne> query =
//			      em.createQuery("Personne.findByLoginPassword", Personne.class);
//		Personne result = query.setParameter("email", email)
//				.setParameter("motPasse", motPasse)
//				.getSingleResult();
//		if (result!=null) {
//			session.setAttribute("user", result);
//			page = "etudiant.html";
//		 }
//		else {
//			map.put("email", email);
//			map.put("msgConnexion", "Utilisateur inconnu");
//		}
//		return page;
//	}
 
}
