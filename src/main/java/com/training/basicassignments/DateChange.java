package com.training.basicassignments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateChange {

	public static String monthChange(Date date)
	{
		SimpleDateFormat sdf= new SimpleDateFormat("dd MMMM yyyy");
		String date1=sdf.format(date);
		return date1;
	}
	
	public static void main(String[] args) throws ParseException {
		Date date=new SimpleDateFormat("dd-MM-yyyy").parse("19-07-1998");
		System.out.println(date);
		String str=monthChange(date);
		System.out.println(str);
	}
}
