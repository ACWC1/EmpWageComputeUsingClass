package com.empwageusingclass;

public class WageForMonth {
	
	static int Is_Present = 1;
	static int Is_Part_Time = 2;
	static int Wage_Per_Hour = 20;
	static int Full_Time = 8;
	static int Part_Time = 4;
	static int Emp_Wage = 0;
	static int day = 0;
	static int Total_Day = 20;
	static int ToltalWage = 0;
	static int empHrs = 0;
	static int Total_Hrs = 0;

	public void MonthWage()
	{
		
		while (day < Total_Day)
		{
			int empCheck = (int) Math.floor(Math.random()*10%3);
		
			switch(empCheck) {
				case 1:
					System.out.println("Present");
					//Emp_Wage = Wage_Per_Hour * Full_Time;
					empHrs = 8;
					break;
			
				case 2:
					System.out.println("Part Time");
					//Emp_Wage = Wage_Per_Hour * Part_Time;
					empHrs = 4;
					break;
				
				
				case 0:
					System.out.println("Absent");
					empHrs = 0;
			}
			day++;
			Total_Hrs = empHrs + Total_Hrs;
			System.out.println(Total_Hrs);
			ToltalWage = Wage_Per_Hour * Total_Hrs;
			System.out.println("Employee Wage is : "+ToltalWage);
		}
	}
}
