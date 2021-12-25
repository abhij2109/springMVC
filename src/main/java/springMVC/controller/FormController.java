package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	@RequestMapping("/form")
	public String form() {
		return "form";
	}
	
	@RequestMapping(path="springMVC/processform",method=RequestMethod.POST)
	public String handleForm(@RequestParam("email") String email,
							 @RequestParam("username") String username,
							 @RequestParam("password") String password,
							 Model model)
	{
		System.out.println("The Email is:"+email);
		System.out.println("The Username is:"+username);
		System.out.println("The Password is:"+password);
		model.addAttribute("email",email);
		model.addAttribute("username",username);
		model.addAttribute("password",password);
		return "success";
	}
}
