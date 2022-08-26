package com.empwageusingclass;

public class EmpPresentAbsent {

		public void Attendance() {
			
			int empCheck = (int) Math.floor(Math.random()*10%2);
			System.out.println(empCheck);
			
			if (empCheck == 1)
			{
				System.out.println("Employee is Present");
			}
			else if(empCheck == 0)
			{
				System.out.println("Employee is Absent");
			}
		}


}