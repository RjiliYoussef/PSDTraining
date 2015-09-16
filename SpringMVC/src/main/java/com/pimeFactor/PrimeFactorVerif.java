package com.pimeFactor;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class PrimeFactorVerif {
	
	
	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	public String getMovie(@PathVariable String name, ModelMap model) {

		model.addAttribute("name", name);
		return "list";

	}
		
	public static String numberCalculator(Integer x)
	{
		String result="";
		if(x<2){
		result="";
		}
		else
		{
			int quotion= x/2;
			while(quotion>0)
			{
				result += "2,";
				quotion--;
			}
			
		}
		return result;
	}

}
