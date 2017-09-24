package springMvcDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("logincontroller")
@RequestMapping("/login")
public class Logincontroller {
	@RequestMapping(value = "/toLogin")
	public String toBatchAdd(Model model){
		return "index";
	}
}
