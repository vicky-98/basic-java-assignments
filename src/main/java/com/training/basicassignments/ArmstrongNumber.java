package com.training.basicassignments;

public class ArmstrongNumber {

	public static String checkArmstrongNumber(int number)
	{
		String str1;
		
		
		int count=0;
		int result=0;
		int num=number;
		int x=number;
		
		while(x != 0)
		{
			int reminder=x%10;
			count++;
			x=x/10;
		}
		
		while(num != 0)
		{
			int reminder=num%10;
			int a=(int) Math.pow(reminder, count);
			result= result+a;
			num=num/10;
		}
		
		if(result==number)
		{
			str1="pass";
			
		}
		else
		{
			str1="fail";
		}
		
		return str1;
		
	}
}
