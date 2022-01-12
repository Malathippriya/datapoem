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
import com.assessment2.datapoem.userService;

@Controller
@RequestMapping("/project")
public class projectController {
	
	 @Autowired
	  private userService service;
	private Object listproject;

	    @GetMapping("/addproject")
	    public String add(Model model) {
	    	List<project> listprojet = service.listAll();
	        model.addAttribute("listproject", listproject);
	        model.addAttribute("project", new project());
	        return "addproject";
	    }

	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String saveCourse(@ModelAttribute("project") project project) {
	        service.save(project);
	        return "redirect:/project";
	    }

	    @RequestMapping("/edit/{id}")
	    public ModelAndView showEditCoursePage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("addproject");
	        user project = service.get(id);
	        mav.addObject("project", project);
	        return mav;
	        
	    }
	    @RequestMapping("/delete/{id}")
	    public String deleteprojectPage(@PathVariable(name = "id") int id) {
	        service.delete(id);
	        return "redirect:/project";
	    }
}
