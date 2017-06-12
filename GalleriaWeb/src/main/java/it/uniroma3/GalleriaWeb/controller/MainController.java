package it.uniroma3.GalleriaWeb.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class MainController {
	  // Login form
	  @RequestMapping("/login")
	  public String login() {
	    return "login";
	  }
}
