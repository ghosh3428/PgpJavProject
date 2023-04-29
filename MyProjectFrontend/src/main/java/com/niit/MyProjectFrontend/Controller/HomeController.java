package com.niit.MyProjectFrontend.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	
	@RequestMapping(value="/home")
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title" , "MY Project Frontend - Index");
		mv.addObject("message" , "Welcome To My Project Frontend Index Page");
		
		return mv;
	}
	
	@RequestMapping(value="/about")
	public ModelAndView about()
	{
		ModelAndView mv = new ModelAndView("about");
		mv.addObject("title" , "MY Project Frontend - About Us");
		mv.addObject("message" , "Welcome To My Project Frontend About Us Page");
		
		return mv;
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView contact()
	{
		ModelAndView mv = new ModelAndView("contact");
		mv.addObject("title" , "MY Project Frontend - Contact Us");
		mv.addObject("message" , "Welcome To My Project Frontend Contact Us Page");
		
		return mv;
	}

}
