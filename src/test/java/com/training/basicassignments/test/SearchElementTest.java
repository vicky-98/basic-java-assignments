package com.training.basicassignments.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.basicassignments.SearchElement;

public class SearchElementTest {

	@Test
	public void testSearchElementArray() {
		int[] array= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		assertEquals(23, SearchElement.searchElementArray(array,23));
	}
}
