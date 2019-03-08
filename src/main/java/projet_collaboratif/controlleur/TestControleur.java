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
import projet_collaboratif.modele.ProjetMembreDto;
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
		
		ArrayList<ProjetMembreDto> projs2 = projetService.findByIdPersonneNative(4);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("test");
		
		modelAndView.addObject("projs", projs);
		
//		String[] continents = {
//		          "Africa", "Antarctica", "Asia", "Australia", 
//		          "Europe", "North America", "Sourth America"
//		        };
//		         
//		modelAndView.addObject("continents", continents);
		
		return modelAndView;
	}
}
