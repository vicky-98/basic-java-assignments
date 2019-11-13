package com.training.basicassignments.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.training.basicassignments.ArmstrongSequence;

public class ArmstrongSequenceTest {

	@Test
	public void testArmstrongSequence()
	{
		List<Integer> list=ArmstrongSequence.listArmstrongNumber(100, 999);
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(153);
		list2.add(370);
		list2.add(371);
		list2.add(407);
		assertEquals(list2, list);
	}
}
