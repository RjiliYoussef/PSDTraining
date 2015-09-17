package com.yosethegame.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class YoseTheGameUtilTest {
	

	@Test
	public void testNumberInferieurA2() {

		assertEquals("", YoseTheGameUtil.numberCalculator(0));
	}
	
	@Test
	public void testNumberSuperieurA2() {

		//assertEquals("[2,2,2]", YoseTheGameUtil.numberCalculator(6));
		assertEquals("[2,2,2]", YoseTheGameUtil.numberCalculator(8));
		assertEquals("[2,2,2,2]", YoseTheGameUtil.numberCalculator(16));
	}

}
