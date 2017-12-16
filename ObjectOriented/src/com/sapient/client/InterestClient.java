package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Interest;

public class InterestClient {
	
	public static void main(String[] args )
	{
		
		Interest obj=new Interest();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the amount");
		double pamt=scan.nextDouble();
		System.out.println("enter the years");
		int terms=scan.nextInt();
		System.out.println("enter the rate");
		float per=scan.nextFloat();
		
		scan.close();
		
		obj.amt=pamt;
		obj.rate=per;
		obj.years=terms;
		double si=obj.calcSimple();
		double ci=obj.calcCompound();
		System.out.println("simple interest" +si);
		System.out.println("compound interest" +ci);		
	}

}
