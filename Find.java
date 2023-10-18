package com.day2.java;

import java.util.Scanner;

public class Find 
	 {
	      int numbers[]=new int[20];
	      Scanner Sc;

	public Find()
	 {
	    Sc=new Scanner(System.in);
	    System.out.println("Enter the numbers:");

	      for(int i=0;i<20;i++)
	       {
	          numbers[i]=Sc.nextInt();
	       }
	  }
	public void positive()
	 {
	    for(int i=0;i<20;i++)
	      {
	         if(numbers[i]>0)
	           {
	               System.out.println("positive nos." + " " + numbers[i] );
	           }
	      }
	  }

	public void negative()
	{
	           for(int i=0;i<20;i++)
	             {
	                 if(numbers[i]<0)
	                   {
	                      System.out.println("negative nos." + " " + numbers[i] );
	                   }
	             }
	}

	public void even()
	{
	       for(int i=0;i<20;i++)
	             {
	                if(numbers[i]%2==0)
	                 {
	                     System.out.println("even nos." + " " + numbers[i] );
	                 }
	             }
	}

	public void odd()
	{
	          for(int i=0;i<20;i++)
	            {
	              if(numbers[i]%2==1)
	               {
	                 System.out.println("odd nos." + " " + numbers[i] );
	               }
		   }
	}

	public static void main(String args[])
	{
	Find f1=new Find();
	f1.positive();
	f1.negative();
	f1.even();
	f1.odd();
	}
	}


