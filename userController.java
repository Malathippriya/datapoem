package com.assessment2.datapoem;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.assessment2.datapoem.project;
import com.assessment2.datapoem.user;
import com.assessment2.datapoem.projectService;
import com.assessment2.datapoem.userService;

@Controller
@RequestMapping("/user")

public class userController {
	
	
	 @Autowired
	    private userService service;
	 
	 @Autowired
	 private userService services;

	    @GetMapping("/adduser")
	    public String add(Model model) {
	    	List<project> listuser = service.listAll();
	    	List<project> listproject = services.listAll();
		    model.addAttribute("listproject", listproject);
	        model.addAttribute("listuser", listuser);
	        model.addAttribute("user", new user());
	        return "adduser";
	    }
	    
	    
	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String saveuser(@ModelAttribute("user") user std) 
	    {
	        service.save(std);
	        return "redirect:/student";
	    }
	    

	    @RequestMapping("/edit/{id}")
	    public ModelAndView showEdituserPage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("adduser");
	        List<project> listproject = services.listAll();
		
	        user std = service.get(id);
	        mav.addObject("user", std);
	        return mav;
	        
	    }
	    @RequestMapping("/delete/{id}")
	    public String deleteuserPage(@PathVariable(name = "id") int id) {
	        service.delete(id);
	        return "user";
	    }
	
	

}