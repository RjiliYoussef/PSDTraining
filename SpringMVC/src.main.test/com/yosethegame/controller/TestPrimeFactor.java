package com.yosethegame.controller;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pimeFactor.PrimeFactorVerif;

public class TestPrimeFactor {

	@Test
	public void testNumberInferieurA2() {

		assertEquals("", PrimeFactorVerif.numberCalculator(0));
	}
	
	@Test
	public void testNumberSuperieurA2() {

		assertEquals("2,2,2,", PrimeFactorVerif.numberCalculator(6));
	}

}
