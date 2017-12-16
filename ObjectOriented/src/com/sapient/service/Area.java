package com.sapient.service;

public class Area {
	public double rad;
	

	public  double calcArea(){
		double arr =Math.PI*rad*rad;
		return arr;
	}
		

	public  double calcPeri(){
		double per =2*Math.PI*rad;
		return per;
	}



}
