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
	
	
}
