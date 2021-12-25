package springMVC.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is Home URL.");
		
		model.addAttribute("name","Virag Jain");
		model.addAttribute("id",111);
		
		List<String> friends=new ArrayList<String>();
		friends.add("Baboochak");
		friends.add("Dhobo");
		friends.add("Chanpli");
		
		model.addAttribute("f",friends);
		
		return "index";
	}  
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about URL.");
		return "about";
	}
}
