package com.training.basicassignments.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.basicassignments.IncomeTax;

public class calculateIncomeTaxTest {

	@Test
	public void testCalculateIncomeTax1() {
		assertEquals(50000, IncomeTax.calculateIncomeTax(50000),0.1);
	}
	
	@Test
	public void testCalculateIncomeTax2() {
		assertEquals(18100.2, IncomeTax.calculateIncomeTax(181002),0.1);
	}
	
	@Test
	public void testCalculateIncomeTax3() {
		assertEquals(80000, IncomeTax.calculateIncomeTax(400000),0.1);
	}
	
	@Test
	public void testCalculateIncomeTax4() {
		assertEquals(180000, IncomeTax.calculateIncomeTax(600000),0.1);
	}
}
