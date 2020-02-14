package com.javhunt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * author: Jesray Garciano
 * website: codetinerant.com
 * 
 */

@Controller
public class JavHuntHome {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Welcome to Javhunt</h3>This message is coming from JavHuntHome.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}

}
