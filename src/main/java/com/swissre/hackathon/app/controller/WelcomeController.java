package com.swissre.hackathon.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.swissre.hackathon.app.model.Route;
import com.swissre.hackathon.app.service.MetroService;

@Controller
public class WelcomeController {

	@Autowired
    MetroService metroService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showWelcomePage(ModelMap model) {
		
		List<Route> routelist= metroService.retrieveRoutes();
		routelist.forEach(route->{
			System.out.println(route.getStations());
		});
    	model.addAttribute("routes", routelist);
		return "welcome";
	}

	

}
