package com.day2.java;
import java.util.Scanner;

import java.util.Scanner;
public class Reactangle
{
private int length;
private int breadth;
private Scanner Sc;



public void calculateArea(int length,int breadth)
{

int area=length*breadth;
System.out.println("area is " + "" + area);

}
public static void main(String args[])
{
Reactangle r1;
r1=new Reactangle();
r1.calculateArea(4,5);
}
}
