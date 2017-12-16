package com.sapient.demo;
import java.util.Scanner;
public class Areaofcirle {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the radius");
		double radius=scan.nextDouble();
		
		double area=calcArea(radius);
		double peri=calcPeri(radius);
		System.out.println("Area" +area);
		System.out.println("Perimeter" +peri);
		
		
	}
	
	
	public static double calcArea(double rad){
		double arr =Math.PI*rad*rad;
		return arr;
	}
		

	public static double calcPeri(double rad){
		double per =2*Math.PI*rad;
		return per;
	}

	

}
