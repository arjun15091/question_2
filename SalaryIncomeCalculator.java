package com.godidgit.questions;


import java.util.Scanner;

class Salary{
	private double basicSalary;
	private double hra;
	private double da;
	private double grossSalary;
	private double pf;
	private double netSalary;
	private double ctc;
	
	
	public Salary(double basicSalary)
	{
	     if(basicSalary<1)
	     {
	    	 System.out.println("Sorry You Can't enter Salary less than 1 !!!!!"+"\n Thanks");
	     }
	     else
	     {
	    	 this.basicSalary=basicSalary;
	     }
	}
	
	public void calculation()  
    {
       hra=(10.0/100.0)*basicSalary;
       da=(10.0/100.0)*basicSalary;
       grossSalary=basicSalary+hra+da;
       pf=(10.0/100.0)*basicSalary;
       netSalary=grossSalary-pf;
       ctc=grossSalary*12.0;     
    }
	
	public void show() {
		System.out.println("(a).  HRA - "+hra);
		System.out.println("(b).  DA - "+da);
		System.out.println("(c).  Gross Salary - "+grossSalary);
		System.out.println("(d).  PF - "+pf);
		System.out.println("(e).  Net Salary - "+netSalary);
		System.out.println("(f).  Annual Package - "+ctc);
	}
}
public class SalaryIncomeCalculator {
    
	
	
	
	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the Basic Salary ---");
		   double basicSalary=sc.nextDouble();
           Salary s1=new Salary(basicSalary);
           if(basicSalary>1)
           {
           s1.calculation();
           s1.show();
           }

	}

}
