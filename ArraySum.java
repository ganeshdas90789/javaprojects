package com.day2.java;
	
	import java.util.Scanner;
	public class ArraySum
	{
	int a[];
	Scanner Sc;
	int totalnumbers;
	public ArraySum()
	{
	Sc=new Scanner(System.in);
	System.out.println("Enter the numbers :");
	totalnumbers=Sc.nextInt();
	a=new int[totalnumbers];
	}
	public void acceptValues()
	{
	for(int i=0;i<totalnumbers;i++)
	{
	System.out.println("Enter the no.:");
	a[i]=Sc.nextInt();
	}
	}
	public void calculateSum()
	{
	int sum=0;
	for(int value:a)
	{
	sum=sum+value;

	}
	System.out.println("sum is " + " " + sum);
	}
	public static void main(String args[])
	{
	ArraySum s1=new ArraySum();
	s1.acceptValues();
	s1.calculateSum();
	}
	}


