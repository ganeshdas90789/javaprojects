package com.training.java;
import java.util.Scanner;

public class swap {
	public static void main(String args[])
	{
	int num1;
	int num2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 1st number:");
	num1=sc.nextInt();
	System.out.println("Enter the 2nd  number:");
	num2=sc.nextInt();
	int num3=num2;
	num2=num1;
	num1=num3;
	/*num1=num1+num2;
	num2=num1-num2;
	num1=num1-num2;*/
	
	System.out.println("after Swapping of two numbers");
	System.out.println("num1 is " + " " + num1);
	System.out.println("num2 is" + " " + num2);

	}

}
