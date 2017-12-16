package com.sapient.client;

import com.sapient.service.SalesPerson;

public class SalesClient {

	public static void main(String[] args)
	{
		SalesPerson s1=new SalesPerson(1001,"ram",45000);
		SalesPerson s3=new SalesPerson(1002,"tam",18000);
		SalesPerson s2=new SalesPerson(1003,"sam",10000);
		s1.display();
		s2.display();
		s3.display();
		System.out.println( "total person"+SalesPerson.noOfPersons);
		System.out.println( "total amount"+SalesPerson.tsales);
	}

}
