package com.training.basicassignments;

public class SimpleCompoundInterest {

	public static double simpleInterest(double principal,double rate,double time) {
		double si= principal*(1+rate*time);
		return si;
	}

	public static double compoundInterest(double principal,double rate,double n,double time) {
		double ci= principal*Math.pow((1+rate/n),n*time);
		return ci;
	}
}
