package com.training.basicassignments.test;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.training.basicassignments.DateChange;

public class DateChangeTest {

	@Test
	public void testMonthChange() throws ParseException {
		Date date=new SimpleDateFormat("dd-MM-yyyy").parse("19-07-1998");
		String str=DateChange.monthChange(date);
		assertEquals("19 July 1998", str);
	}
}
