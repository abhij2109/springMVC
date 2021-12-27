package springMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springMVC.model.User;
import springMVC.service.UserService;

@Controller
public class FormController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/form")
	public String form(Model m) {
		m.addAttribute("Header","Coding is compulsory.");
		return "form";
	}
	
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
		
		if(user.getUsername().isBlank())
		{
			return "redirect:/form";
		}
		
		model.addAttribute("user",user);
		int createdUser=this.userService.createUser(user);
		model.addAttribute("msg","Registration succesful with id"+createdUser);
		return "success";
	}
	
	/*
	 * @RequestMapping(path="/processform",method=RequestMethod.POST) public String
	 * handleForm(@ModelAttribute User user,Model model) { return "success"; }
	 */
}
