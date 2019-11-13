package com.training.basicassignments;

public class ResultDeclaration {

	public static String result(int m1,int m2,int m3) {
		String str = null;
		
		if(m1>60 && m2>60 && m3>60){
			str="Pass";
		}else if(m1>60 && m2>60 || m2>60 && m3>60 || m1>60 && m3>60){
			str="Promoted";
		}else if(m1>60 || m2>60 || m3>60){
			str="fail";
		}else {
			str="fail";
		}
		
		return str;
	}
}
