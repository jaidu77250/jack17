package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Area;
import util.SapUtil;

public class AreaClient {
public static void main(String[] args) {
	Area obj=new Area();
	Scanner scan=new Scanner(System.in);
	
	double rad=scan.nextDouble();
	obj.rad = rad;	
	double arr=obj.calcArea();
	double per=obj.calcPeri();
	System.out.println("Area" +SapUtil.roundUp2Dec(arr));
	System.out.println("Perimeter" +per);	
	scan.close();
}

}
