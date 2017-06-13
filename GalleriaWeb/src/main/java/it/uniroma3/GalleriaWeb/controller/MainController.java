<<<<<<< HEAD
package it.uniroma3.GalleriaWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {
	 @RequestMapping("/login")
	  public String login() {
	    return "login";
	  }
}
=======
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
>>>>>>> branch 'master' of https://github.com/TheReygen/GalleriaWeb.git
