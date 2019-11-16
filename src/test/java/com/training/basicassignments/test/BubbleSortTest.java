package com.training.basicassignments.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.basicassignments.BubbleSort;

public class BubbleSortTest {

	@Test
	public void testBubbleSort() {
		int[] array= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int[] b= {1,5,6,7,12,14,19,23,26,35,37,47,52,78,86};
		int[] a=BubbleSort.bubbleSort(array);
		for(int i=0;i<array.length;i++)
		{
			assertEquals(b[i], a[i]);
		}
		
	}
	
}
