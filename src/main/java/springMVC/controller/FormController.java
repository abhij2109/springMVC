package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springMVC.model.User;

@Controller
public class FormController {
	
	@RequestMapping("/form")
	public String form(Model m) {
		m.addAttribute("Header","Coding is compulsory.");
		return "form";
	}
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model)
	{
		return "success";
	}
}

// All three steps are done by @ModelAttribute annotation.
/*
@RequestMapping(path="/processform",method=RequestMethod.POST)
public String handleForm(@RequestParam(name="email",required=true) String email,
						 @RequestParam("username") String username,
						 @RequestParam("password") String password,
						 Model model)
{
	User user=new User();
	user.setEmail(email);
	user.setUsername(username);
	user.setPassword(password);
	
	model.addAttribute("user",user);
	System.out.println(user);
	
	return "success";
}
*/