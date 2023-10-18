package com.day2.java;

import java.util.Scanner;

public class Check {
	int numbers[]=new int[10];
	int arbitarynum;
	Scanner Sc;

	public Check()
	{
	Sc=new Scanner(System.in);
	System.out.println("Enter the numbers:");
	for(int i=0;i<10;i++)
	{
	numbers[i]=Sc.nextInt();
	}
	}
	public void accept()
	{
	System.out.println("Enter a number:");
	arbitarynum=Sc.nextInt();
	}
	public void display()
	{
	for(int i=0;i<10;i++)
	{
	if(numbers[i]==arbitarynum)
	{
	System.out.println("Number is present.");
	}

	}
	}


}
