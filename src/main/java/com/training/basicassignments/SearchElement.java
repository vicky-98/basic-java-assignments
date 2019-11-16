package com.training.basicassignments;

public class SearchElement {

	public static int searchElementArray(int[] array,int element) {
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==element) {
				return array[i];
			}
		}
		return -1;
	}
}
