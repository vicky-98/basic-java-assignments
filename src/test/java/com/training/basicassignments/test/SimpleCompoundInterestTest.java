package com.training.basicassignments.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.basicassignments.SimpleCompoundInterest;

public class SimpleCompoundInterestTest {

	@Test
	public void simpleInterestTest()
	{
		assertEquals(1210, SimpleCompoundInterest.simpleInterest(10,12,10),0.1);
	}
	
	@Test
	public void compoundInterestTest()
	{
		assertEquals(24010, SimpleCompoundInterest.compoundInterest(10, 12, 2, 2),0.1);
	}
}
