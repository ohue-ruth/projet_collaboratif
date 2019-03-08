package projet_collaboratif.controlleur;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import projet_collaboratif.modele.Equipe;
import projet_collaboratif.modele.Personne;
import projet_collaboratif.service.EquipeServiceImp;

@Controller
class EquipeControleur {

	@Autowired
	private EquipeServiceImp equipeService;

	@GetMapping("creerEquipe-{idProjet}")
	public String addEquipe(
			HttpSession session,
			@PathVariable(value="idProjet") int idProjet,
			@RequestParam(value="commentaire", defaultValue="") String commentaire) {
		Personne user = (Personne) session.getAttribute("user");
		Equipe equipe = new Equipe(1, commentaire, user);
//		boolean flag = equipeService.addEquipe(equipe);
		return "redirect:equipe-" + equipe.getIdEquipe();
		
		
//		boolean flag = equipeService.addEquipe(equipe);
	}

	@GetMapping("equipe-{idEquipe}")
	public String equipeForm(@PathVariable(value="idEquipe") int idEquipe,
			ModelMap map) {
		// Recuperer l'quipe via la dao
		Equipe equipe = new Equipe();
		map.put("equipe", equipe);
		return "equipe.html";
	}
}
