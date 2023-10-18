package com.training.java;
import java.util.Scanner;

public class Area {
	public static void main(String args[])
	{
	int radius;
	float pi=3.141f;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius in cm :");
	radius=sc.nextInt();

	double Area=pi*radius*radius;
	System.out.println("the Area of the circle is : " + Area);


	}

}
