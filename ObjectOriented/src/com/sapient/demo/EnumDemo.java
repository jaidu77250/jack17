package com.sapient.demo;

import java.util.Scanner;

public class EnumDemo {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first value");
		int v1=scan.nextInt();
	
		System.out.println("Enter the second value");
		int v2 =scan.nextInt();
	
		System.out.println("Choose 1--add\n 2--sub\n 3--multiply\n");
		String str=scan.next();
	
		try{
		Menu menu =Menu.valueOf(str.toUpperCase());
		
		switch(menu)
		{
		case ADD:
			System.out.println("Add"+(v1+v2));
			break;
			

		case SUB:
			System.out.println("SUBSTRACT"+(v1-v2));
			break;
			

		case MULTIPLY:
			System.out.println("MULTIPLY"+(v1*v2));
			break;
					}
	
}

	catch(Exception ex)
	{
		System.out.println("Invalid option");
	}
			}
}

enum Menu{
	ADD,SUB,MULTIPLY
}