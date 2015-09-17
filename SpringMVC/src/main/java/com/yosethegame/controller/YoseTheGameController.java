package com.yosethegame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yosethegame.utils.YoseTheGameUtil;

@Controller
@RequestMapping("/YoseTheGame")
public class YoseTheGameController {

	@RequestMapping(value="/name/ping", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public Object getMovie(ModelMap model) {
		
		return "{\"alive\":true}" ;

	}
	
	@RequestMapping(value="/name", method = RequestMethod.GET)
	public String getGame(ModelMap model) {
		return "list" ;

	}
	
	@RequestMapping(value="/contact", method = RequestMethod.GET)
	public String getContactPage(ModelMap model) {
		return "contact" ;

	}
	
	@RequestMapping(value="/name/primeFactors", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String getPowerOfTwo(ModelMap model, @RequestParam("number") int number) {
		String decomposition = YoseTheGameUtil.numberCalculator(number);
		String result = "{\"number\" : "+number+","
				+ "\"decomposition\" : "+decomposition+
				"}";
		return result ;

	}
	
}