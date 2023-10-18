package com.training.java;
import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {
		int radius;
		float pi=3.141f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius in cm :");
		radius=sc.nextInt();

		double perimeter=2*(pi*radius);
		System.out.println("the perimeter of the circle is : " + perimeter);

	}

}
