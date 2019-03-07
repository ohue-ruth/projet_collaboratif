package projet_collaboratif.controlleur;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import projet_collaboratif.modele.Personne;
import projet_collaboratif.modele.Projet;
import projet_collaboratif.service.PersonneService;
import projet_collaboratif.service.ProjetService;

@Controller
@RequestMapping("test")
public class TestControleur {

	@Autowired
	private ProjetService projetService;

	@Autowired
	private PersonneService personneService;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView afficher() {
		Personne personne = new Personne();
		personne.setIdPersonne(1);
		ArrayList<Projet> projs = projetService.findProjetsByIdPromotionNative(1);
		ArrayList<Personne> formateursProjet = new ArrayList<Personne>();
		for (Projet projet : projs) {
			//projet.getTitre();
			formateursProjet.add(personneService.findByIdPersonne(projet.getPersonne().getIdPersonne()));
		}
		System.out.println(formateursProjet);
		
		
//		formateursProjet.add(new Personne());
//		formateursProjet.add(new Personne());
//		formateursProjet.add(new Personne());
		
		
		//System.out.println(projs);
		//System.out.println(formateursProjet.toString());
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("test");
		
		//modelAndView.addObject("des", formateursProjet.get(0));
		modelAndView.addObject("projs", formateursProjet);
		//modelAndView.addObject("personne", personne);
		
//		String[] continents = {
//		          "Africa", "Antarctica", "Asia", "Australia", 
//		          "Europe", "North America", "Sourth America"
//		        };
//		         
//		modelAndView.addObject("continents", continents);
		
		return modelAndView;
	}
}
