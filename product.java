package com.training.java;
import java.util.Scanner;

public class product {
	
	public static void main(String args[])
	{
	int num1;
	int num2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 1st number:");
	num1=sc.nextInt();
	System.out.println("Enter the 2nd number:");
	num2=sc.nextInt();
	int result=num1*num2;
	System.out.println("the product is" + result);



	}

}
