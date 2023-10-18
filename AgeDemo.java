package com.training.java;

import java.util.Scanner;

public class AgeDemo {
	public static void main(String args[])
	{
	int age;
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter the age :-");
	age=Sc.nextInt();
	if(age>18 && age<60)
	{
	System.out.println("This is the valid age");
	}
	else
	{
	System.out.println("This  is not the valid age");
	}

	}
	
}


