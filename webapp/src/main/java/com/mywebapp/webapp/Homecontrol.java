package com.mywebapp.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Homecontrol {

	@RequestMapping("home")
//	public String display(HttpServletRequest req) {
//		HttpSession ses = req.getSession();
//		String name = req.getParameter("name");//inside parameter is to be used in frontend page
//		System.out.println("hello" +" "+name);
//		ses.setAttribute("name", name);//(String name is in front end,object value is in url)
//		return "home";
//	}
	//By using Model and View Controller
//	public String display(@RequestParam("myname")String name, HttpSession ses) {
//		System.out.println("hello" +" "+name); 
//		ses.setAttribute("obj", name);
//		return "home";
//	}
	//using Model and view class
//	public ModelAndView display(String myname) {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("name",myname);
//		mv.setViewName("home");
//		return mv;
//	}
	//inserting a Object as input data
	public ModelAndView display(Employee emp) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",emp);
		mv.setViewName("home");
		return mv;
	}

}
