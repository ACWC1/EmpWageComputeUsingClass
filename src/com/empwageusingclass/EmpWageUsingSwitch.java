package com.empwageusingclass;

public class EmpWageUsingSwitch {
	
	static int Is_Present = 1;
	static int Is_Part_Time = 2;
	static int Wage_Per_Hour = 20;
	static int Full_Time = 8;
	static int Part_Time = 4;
	static int Emp_Wage = 0;

	public void WageCalculator()
	{
		int empCheck = (int) Math.floor(Math.random()*10%3);
		System.out.println(empCheck);
		
		switch(empCheck) {
		case 1:
			System.out.println("Present");
			Emp_Wage = Wage_Per_Hour * Full_Time;
			break;
	
		case 2:
			System.out.println("Part Time");
			Emp_Wage = Wage_Per_Hour * Part_Time;
			break;
			
		case 0:
			System.out.println("Absent");
			Emp_Wage = 0;
		}
		System.out.println("Employee Wage is : "+Emp_Wage);
	}
}
