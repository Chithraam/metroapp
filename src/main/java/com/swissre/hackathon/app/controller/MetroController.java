package com.swissre.hackathon.app.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import com.swissre.hackathon.app.model.MetroCoachModel;
import com.swissre.hackathon.app.model.Store;
import com.swissre.hackathon.app.service.MetroService;
import com.swissre.hackathon.app.service.StoreService;
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
    StoreService service;

    @Autowired
    MetroService metroService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        // Date - dd/MM/yyyy
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                dateFormat, false));
    }

    @RequestMapping(value = "/list-stores", method = RequestMethod.GET)
    public String showStores(ModelMap model) {
        String name = getLoggedInUserName(model);
        model.put("stores", service.retrieveStores(name));
        return "list-stores";
    }

    private String getLoggedInUserName(ModelMap model) {
        return "User";
      /*  Object principal = SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            return ((UserDetails) principal).getUsername();
        }

        return principal.toString();*/
    }

/*    @RequestMapping(value = "/add-store", method = RequestMethod.GET)
    public String showAddStorePage(ModelMap model) {
        model.addAttribute("store", new Store(0, getLoggedInUserName(model),
                "Default Desc", new Date(), false));
        return "store";
    }*/

    @RequestMapping(value = "/delete-store", method = RequestMethod.GET)
    public String deleteStore(@RequestParam int id) {

        if(id==1)
            throw new RuntimeException("Something went wrong");

        service.deleteStore(id);
        return "redirect:/list-stores";
    }

    @RequestMapping(value = "/update-store", method = RequestMethod.GET)
    public String showUpdateStorePage(@RequestParam int id, ModelMap model) {
        Store store = service.retrieveStore(id);
        model.put("store", store);
        return "store";
    }

    @RequestMapping(value = "/update-store", method = RequestMethod.POST)
    public String updateStore(ModelMap model, @Valid Store store,
                              BindingResult result) {

        if (result.hasErrors()) {
            return "store";
        }

        //store.setUser(getLoggedInUserName(model));

        service.updateStore(store);

        return "redirect:/list-stores";
    }

    @RequestMapping(value = "/add-store", method = RequestMethod.POST)
    public String addStore(ModelMap model, @Valid Store store, BindingResult result) {

        if (result.hasErrors()) {
            return "store";
        }

        /*service.addStore(getLoggedInUserName(model), store.getDesc(), store.getTargetDate(),
                false);*/
        return "redirect:/list-stores";
    }

    @RequestMapping(value = "/list-trains", method = RequestMethod.GET)
    public String search(@RequestParam(value = "station", required = true) String station,
                         @RequestParam(value = "route", required = true) String route,ModelMap model){

        System.out.println("Station: "+station);
        System.out.println("Route: "+route);
        List<MetroCoachModel> list=new ArrayList<>();
        list=metroService.retrieveTrains(route,station);
        model.addAttribute("trains", list);
        return "list-metro";
    }

    @RequestMapping(value = "/list-metro", method = RequestMethod.GET)
    public List<MetroCoachModel> searchapi(@RequestParam(value = "station", required = true) String station,
                                           @RequestParam(value = "route", required = true) String route, ModelMap model){

        System.out.println("Station: "+station);
        System.out.println("Route: "+route);
        List<MetroCoachModel> list=new ArrayList<>();
        list=metroService.retrieveTrains(station,route);
        return list;
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView searchPage()
    {
        ModelAndView mav = new ModelAndView("search");
        return mav;
    }

    @RequestMapping(value = "/doSearch", method = RequestMethod.POST)
    public ModelAndView search(
            @RequestParam("station")
                    String station,@RequestParam("route")
            String route
    ) throws Exception
    {

        System.out.println("In search");
       /* List<Book> allFound = _repo.searchForBook(searchText);
        List<BookModel> bookModels = new ArrayList<BookModel>();

        for (Book b : allFound)
        {
            BookModel bm = new BookModel();
            bm.setBookAuthor(b.getAuthor());
            bm.setBookDescription(b.getDescription());
            bm.setBookTitle(b.getTitle());

            bookModels.add(bm);
        }*/

        ModelAndView mav = new ModelAndView("foundBooks");
        /*mav.addObject("foundBooks", bookModels);*/
        return mav;
    }
}
