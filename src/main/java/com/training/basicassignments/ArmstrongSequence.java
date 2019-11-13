package com.training.basicassignments;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongSequence {
public static List<Integer> listArmstrongNumber(int start,int end)
{
	List<Integer> list=new ArrayList<Integer>();
	for(int number=start;number<=end;number++)
    {
	String s1;
	
	
	int count=0;
	int result=0;
	int x=number;
	int y=number;
	
	while(x != 0)
	{
		int reminder=x%10;
		count++;
		x=x/10;
	}
	
	
	while(y != 0)
	{
		int reminder=y%10;
		int a=(int) Math.pow(reminder, count);
		result= result+a;
		y=y/10;
	}
	
	
	if(number==result)
	{
	list.add(result);
	}
	
    }
	return list;
	
	
}
}
