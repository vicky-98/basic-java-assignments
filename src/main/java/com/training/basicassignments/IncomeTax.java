package com.training.basicassignments;

public class IncomeTax {

	public static double calculateIncomeTax(double pay)
	{
		double tax = 0;
		if(pay>0 && pay<=180000){
			tax=pay;
		}else if(pay>181001 && pay<=300000) {
			tax=pay*0.1;
		}else if(pay>300001 && pay<=500000) {
			tax=pay*0.2;
		}else if(pay>500001 && pay<=1000000) {
			tax=pay*0.3;
		}
		return tax;
	}
}
