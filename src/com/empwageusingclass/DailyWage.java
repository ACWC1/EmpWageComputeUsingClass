package com.empwageusingclass;

public class DailyWage {
	
	static int Is_Present = 1;
	static int Is_Part_Time = 2;
	static int Wage_Per_Hour = 20;
	static int Full_Time = 8;
	static int Part_Time = 4;
	static int Emp_Wage = 0;
	
	public void WageBuiler() {
				
		int empCheck = (int) Math.floor(Math.random()*10%2);
		System.out.println(empCheck);
		
		if(empCheck == Is_Present)
		{
			System.out.println("Present");
			Emp_Wage = Wage_Per_Hour * Full_Time; 
		}
		else
		{
			System.out.println("Absent");
			Emp_Wage = 0;
		}
		System.out.println("Employee Wage is : "+Emp_Wage);
	}

}
