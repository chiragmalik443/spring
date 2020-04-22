package com.brainmentors.apps.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.brainmentors.apps.models.User;

@Controller
public class WelcomeController {
	@RequestMapping("/hello")
	public String sayWelcome(Model model) {
		model.addAttribute("msg", "Hello User");
		model.addAttribute("userModel", new User());
		//model.addAttribute("userModel",new User("anil","1234"));
		return "welcome";
	}
	
	@RequestMapping(path = "/login3",method = RequestMethod.POST)
	public String doLogin(@ModelAttribute("userModel") User user , Model model) {
		if(user.getUserid().equals(user.getPwd())) {
			model.addAttribute("msg", "Hello  "+user.getUserid());
		}
		else {
			model.addAttribute("msg", "Invalid Userid or Password");
		}
		return "dashboard";
	}
	
	@RequestMapping(path = "/login2",method = RequestMethod.POST)
	public String doLogin(@RequestParam("userid") String uid, @RequestParam("pwd") String password, Model model) {
		if(uid.equals(password)) {
			model.addAttribute("msg", "Hello  "+uid);
		}
		else {
			model.addAttribute("msg", "Invalid Userid or Password");
		}
		return "dashboard";
	}
	
	@RequestMapping("/login")
	public String doLogin(HttpServletRequest request, Model model) {
		String userid = request.getParameter("userid");
		String password = request.getParameter("pwd");
		if(userid.equals(password)) {
		model.addAttribute("msg", "Hello  "+userid);
		}
		else {
			model.addAttribute("msg", "Invalid Userid or Password");
		}
		return "dashboard";
	}
}
