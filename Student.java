package com.day2.java;

	import java.util.Scanner;
	public class Student
	{
	private int studentid;
	private String studentname;
	private int  score;
	private Scanner sc;


	public void accept()
	{
	sc=new Scanner(System.in);
	System.out.println("Enter the studentid:");
	studentid=sc.nextInt();
	System.out.println("Enter the studentname:");
	studentname=sc.next();
	System.out.println("Enter the score:");
	score=sc.nextInt();
	}
	public void show()
	{
	System.out.println("studentid" + " " +studentid);
	System.out.println("studentid" + " " +studentname);
	System.out.println("studentid" + " " +score);
	}
	public static void main(String args[])
	{
	Student obj;//reference variable or null object
	obj=new Student();//object
	obj.accept();
	obj.show();
	}
	}


