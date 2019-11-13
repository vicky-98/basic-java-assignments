package com.training.basicassignments.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.basicassignments.ResultDeclaration;

public class ResultDeclarationTest {

	@Test
	public void testTesultDeclaration() {
		assertEquals("Pass", ResultDeclaration.result(61, 61, 61));
	}
	
	@Test
	public void testTesultDeclaration1() {
		assertEquals("Promoted", ResultDeclaration.result(61, 60, 61));
	}
	
	@Test
	public void testTesultDeclaration2() {
		assertEquals("fail", ResultDeclaration.result(61, 45, 50));
	}
}
