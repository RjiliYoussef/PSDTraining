package com.yosethegame.utils;

public class YoseTheGameUtil {

	public static String numberCalculator(Integer x) {
		String result = "";
		if (x < 2) {
			result = "";
		} else {
			int quotion=x ;
			result = "[";
			while (quotion >2 ) {
								
					result += "2,";
					quotion = quotion/2;
	
			}
			result += "2]";

		}
		return result;
	}
}
