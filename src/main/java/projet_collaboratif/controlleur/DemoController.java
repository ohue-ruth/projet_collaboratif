package projet_collaboratif.controlleur;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	@RequestMapping(value="/demo")
	public String demo(ModelMap map) {
		map.put("nom", "Idir");
		return "demo.html";
	}
}
