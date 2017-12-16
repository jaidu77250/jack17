package com.sapient.service;

public class SalesPerson {

	public int id;
	public String name;
	public double samt;
	public static int noOfPersons;
	public static double tsales;	
	public SalesPerson(int id, String name, double samt) {
		super();
		this.id = id;
		this.name = name;
		this.samt = samt;
     ++noOfPersons;
     tsales=tsales+this.samt;
	}

	public double calcSalesComm()
	{
		double sc=0;
		if(samt>=50000)
			sc=sc*0.1;
		else if(samt>=20000 && samt<50000)
			sc=sc*0.05;
		else
			sc=sc*.03;
		return sc;
	}
	
	public void display()
	{
		System.out.println(id+ " "+name +" " +samt +" ");
	}
}
