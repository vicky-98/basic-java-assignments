package com.training.basicassignments.test;

import org.junit.Test;

import com.training.basicassignments.SquareTheNumber;

import static org.junit.Assert.assertEquals;

public class SquareTheNumberTest {

	@Test
	public void testSquareNumberWithPositiveNumber()
	{
		assertEquals(25,SquareTheNumber.squareNumber(5));
	}
	
	@Test
	public void testSquareNumberWithNegativeNumber()
	{
		assertEquals(25,SquareTheNumber.squareNumber(-5));
	}
}
