package com.training.java;
import java.util.Scanner;

public class StudentInsert {
	private Scanner sc;
	private student Studentarr[];
	
	public StudentInsert()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter no.of student which  you want to have:-");
		int noofstudent=sc.nextInt();
		Studentarr=new student[noofstudent];
		
	}
	public void acceptDetails()
	{
		for(int i=0;i<Studentarr.length;i++)
		{
			Studentarr[i]=new student();
			System.out.println("Enter studentid:");
			Studentarr[i].setStudentid(sc.nextInt());
			System.out.println("Enter student name:");
			Studentarr[i].setStudentname(sc.next());
			System.out.println("Enter student score:");
			Studentarr[i].setScore(sc.nextInt());
		}
	}
	public void displaydetails()
	{
		for(student s:Studentarr)
		{
			System.out.println("student id is:" + " " +s.getStudentid() );
			System.out.println("Student name is" + "  " + s.getStudentname());
			System.out.println("student score is" + " " + s.getScore());
	
			
		}
	}
	public void searchByStudentid()
	{
		System.out.println("Enter studentid:");
		int search=sc.nextInt();
		student sfound=null;
		
		for(student s:Studentarr)
		{
			if(s.getStudentid()==search)
			{
				sfound=s;
			}
		}
		if(sfound!=null)
		{
			System.out.println("student found");
			
			
		}
		else
		{
			System.out.println("Student notfound");
		}
	}
	public void search()
	{
		System.out.println("Enter the empid you want to change:");
		int studentid=sc.nextInt();
		for(student s:Studentarr)
		{
			if(s.getStudentid()==studentid)
			{
				s.setScore(89);
				
			}
		}
	}
	
	public static void main(String args[])
	{
		StudentInsert st=new StudentInsert();
		st.acceptDetails();
		//st.searchByStudentid();
		st.search();
		st.displaydetails();
	}

}


