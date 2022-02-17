package com.bridgelabz;

public class EmployeeWageMethods {
	int wagePerHour=20;
	int fullDayHour=8;
	int partTimeHour=4;
	int workingDaysInMonth=20;

	int wagePerDay;
	int totalWage=0;
	int totalWorkingHour=0;
	int totalWorkingDay=0;

	public  void employeeWage() {



		for(int i=1;i<=workingDaysInMonth;i++)
		{
			if(totalWorkingHour<=100 && totalWorkingDay<=20)
			{	
				double empCheck=Math.floor((Math.random()*10) % 3);

				if(empCheck==2)
				{
					wagePerDay=(wagePerHour*fullDayHour);
					totalWage=totalWage+wagePerDay;
					totalWorkingHour=totalWorkingHour+fullDayHour;
					totalWorkingDay++;
				}

				else if (empCheck==1) 
				{

					wagePerDay=(wagePerHour*partTimeHour);
					totalWage=totalWage+wagePerDay;
					totalWorkingHour=totalWorkingHour+partTimeHour;
					totalWorkingDay++;
				}
				else
				{
					wagePerDay=0;
					totalWage=totalWage+wagePerDay;
				}

			}
			else 
				break;
		}


		System.out.println("Total working hour = "+totalWorkingHour);
		System.out.println("Toatl working day = "+totalWorkingDay);
		System.out.println("Total wage of the month = "+totalWage);


	}

	public static void main(String[] args) {		
		EmployeeWageMethods emp=new EmployeeWageMethods();
		emp.employeeWage();
	}

}
