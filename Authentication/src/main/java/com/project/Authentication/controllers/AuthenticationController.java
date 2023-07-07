package com.project.Authentication.controllers;

import org.springframework.ui.Model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.Authentication.entities.User;
import com.project.Authentication.exceptions.UserNotFoundException;
import com.project.Authentication.services.AuthenticationService;

@Controller
public class AuthenticationController {

	Logger logger = LoggerFactory.getLogger(AuthenticationController.class);

	@Autowired
	AuthenticationService authService;

	@GetMapping("/")
	public String showGreeting() {
		return "greeting";
	}

	@GetMapping("/Auth")
	public String showLogin() {
		return "authenticate";
	}

	@PostMapping("/Auth")
	public String authenticateUser(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
	    try {
	        User user = authService.GetUserByName(username);
	        logger.info("{} attempted to login with password: {}", user.getName(), user.getPassword());

	        if (authService.isValidPassword(password, user.getPassword())) {
	            return "success";
	        } else {
	            model.addAttribute("error", "Invalid password");
	            return "failure";
	        }
	    } catch (UserNotFoundException e) {
	        model.addAttribute("error", "User not found");
	        return "failure";
	    } catch (Exception e) {
	        model.addAttribute("error", "An unexpected error occurred");
	        return "failure";
	    }
	}

	}  
