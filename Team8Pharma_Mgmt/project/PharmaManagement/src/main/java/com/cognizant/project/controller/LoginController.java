package com.cognizant.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.project.entity.ManageUser;

import com.cognizant.project.service.UserService;

@Controller
public class LoginController {
	@Autowired
	UserService userService;
	@RequestMapping("/")
	public String displayLoginpage(Model theModel) {
		ManageUser login = new ManageUser();
		theModel.addAttribute("login", login);
		return "login";
	}

	/**@RequestMapping("/userLogin")
	public String LoginPage( @ModelAttribute("login") ManageUser theUser,Model theModel) {
		
		List<ManageUser> user=userService.getAllUsers();
		int flag=0;
       for(ManageUser u:user) {
		if (theUser.getUserName().equalsIgnoreCase(u.getUserName()) && theUser.getPassword().equals(u.getPassword())) {
           flag=1;
           break;
		}
       }
       if(flag==1) {return "main-page";
		} 
		else {
			String msg = "The username or password you have entered is incorrect.";
			theModel.addAttribute("msg", msg);
			return "error-page";
		}
	}**/
	
	@RequestMapping("/userLogin")
	public String LoginPage(@RequestParam("userName") String username, @RequestParam("password") String password,
			Model theModel) {

		
		List<ManageUser> user=userService.getAllUsers();
		int flag=0;
       for(ManageUser u:user) {
		if (username.equalsIgnoreCase(u.getUserName()) && password.equals(u.getPassword())) {
           flag=1;
           break;
		}
       }
       if(flag==1) {return "main-page";
		} 
		else {
			String msg = "The username or password you have entered is incorrect.";
			theModel.addAttribute("msg", msg);
			return "error-page";
	}
	}

}
