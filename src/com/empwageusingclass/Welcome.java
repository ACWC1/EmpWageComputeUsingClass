package com.empwageusingclass;

public class Welcome {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to EMP Wage Calculator !!! ");
		
//		EmpPresentAbsent empPresentAbsent = new EmpPresentAbsent(); 
//		empPresentAbsent.Attendance();
		
//		DailyWage dailyWage = new DailyWage();
//		dailyWage.WageBuiler();
		
//		WageForPartTime wageForPartTime = new WageForPartTime();
//		wageForPartTime.PartTimeWage();
		
//		EmpWageUsingSwitch empWageUsingSwitch = new EmpWageUsingSwitch();
//		empWageUsingSwitch.WageCalculator();
		
		WageForMonth wageForMonth = new WageForMonth();
		wageForMonth.MonthWage();
		
	}

}
