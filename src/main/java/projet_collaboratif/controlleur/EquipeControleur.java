package projet_collaboratif.controlleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import projet_collaboratif.modele.Equipe;
import projet_collaboratif.service.EquipeServiceImp;

@Controller
@RequestMapping("equipe")
 class EquipeControleur {

	@Autowired
	private EquipeServiceImp equipeService;
	
	
	
	@PostMapping("equipe")
	public ResponseEntity<Void> addEquipe(@RequestBody Equipe equipe, UriComponentsBuilder builder) {
                boolean flag = equipeService.addEquipe(equipe);
                if (flag == false) {
        	   return new ResponseEntity<Void>(HttpStatus.CONFLICT);
                }
                HttpHeaders headers = new HttpHeaders();
                headers.setLocation(builder.path("/equipe/{id}").buildAndExpand(equipe.getIdEquipe()).toUri());
                return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
                
                

                    
                } 
                
	
	
} 
	
	
	
	

