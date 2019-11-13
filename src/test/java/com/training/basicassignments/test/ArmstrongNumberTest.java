package com.training.basicassignments.test;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import com.training.basicassignments.ArmstrongNumber;

public class ArmstrongNumberTest {

	@Test
	public void testArmstrongNumberWithVaildNumber()
	{
		assertEquals("pass",ArmstrongNumber.checkArmstrongNumber(153));
	}
	
	@Test
	public void testArmstrongNumberWithinVaildNumber()
	{
		assertEquals("fail",ArmstrongNumber.checkArmstrongNumber(435));
	}
	
	@Test
	public void testArmstrongNumberWithnegativeNumber()
	{
		assertEquals("fail",ArmstrongNumber.checkArmstrongNumber(-1634));
	}
}
