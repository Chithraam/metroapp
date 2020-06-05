package com.swissre.hackathon.app.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import com.swissre.hackathon.app.model.MetroCoachModel;
import com.swissre.hackathon.app.model.Route;
import com.swissre.hackathon.app.service.MetroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
/*import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MetroController {

    @Autowired
    MetroService metroService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        // Date - dd/MM/yyyy
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                dateFormat, false));
    }

    @RequestMapping(value = "/list-routes", method = RequestMethod.GET)
    public String fetchRoutes(ModelMap model){
    	List<Route> list= metroService.retrieveRoutes();
    	model.addAttribute("routes", list);
    	return "list-routes";
    	
    }

    @RequestMapping(value = "/list-trains", method = RequestMethod.GET)
    public String search(@RequestParam(value = "station", required = true) String station,
                         @RequestParam(value = "route", required = true) String route,ModelMap model){

        System.out.println("Station: "+station);
        System.out.println("Route: "+route);
        List<MetroCoachModel> list=new ArrayList<>();
        list=metroService.retrieveTrainDetails(route,station);
        model.addAttribute("trains", list);
        return "list-metro";
    }

   
}
