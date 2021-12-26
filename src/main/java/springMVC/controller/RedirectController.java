package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	
	@GetMapping("/one")
	public RedirectView one() {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("enjoy");
		return redirectView;
	}
	
	@GetMapping("/enjoy")
	public String two() {
		return "form";
	}
}
