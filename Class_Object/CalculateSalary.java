/*Q4. Create a base class Employee with fields empId, name, and salary.
Create a subclass Manager with an additional field bonus.
Create another subclass Intern with an additional field internshipDuration.
• Implement parameterized constructors.
• Write a method calculateFinalSalary() in each class to calculate the salary:
o For Employee, return salary.
o For Manager, add bonus to salary.
o For Intern, divide salary by the internship duration in months.
• Use an array to store employee data for all types, and implement a method to
display the final salary of each employee.*/

import java.util.*;
class Employee
{
	private int empId;
	private String name;
	private double salary;
	
	 //Parameterized constructor
	 public Employee(int empId, String name, double salary)
	 {
		 this.empId=empId;
		 this.name=name;
		 this.salary=salary;
	 }
	 
	  //Parameterized constructor
	 public double calculateFinalSalary()
	 {
		 return salary;
	 }
	 
	 // Method to display employee details
	 public void displayDetails()
	 {
		 System.out.println("Employee id is"+empId);
		 System.out.println("Employee name is"+name);
		 System.out.println("Employee salary is"+calculateFinalSalary());	 
	 }
}

class Manager extends Employee
{
	private double bonus;
	
	// Parameterized constructor
	public Manager(int empId, String name, double salary, double bonus)
	{
		super(empId, name, salary);
		this.bonus=bonus;
	}
	
	 public double calculateFinalSalary()
	 {
		 return super.calculateFinalSalary()+bonus;
	 }
}

class Intern extends Employee
{
	private int internshipDuration;
	
	// Parameterized constructor
	public Intern(int empId, String name, double salary, int internshipDuration)
	{
		super(empId,name,salary);
		this.internshipDuration=internshipDuration;
	}
		public double calculateFinalSalary() 
		{
			return super.calculateFinalSalary() / internshipDuration;
		}
}

public class CalculateSalary
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		Employee emp[]=new Employee[3];
		for(int i=0; i<emp.length; i++)
		{
			System.out.println("Enter details for employee");
			System.out.println("1. Regular employee");
			System.out.println("2. manager");
			System.out.println("3. Intern");
			System.out.println("choose type(1/2/3/):");
			int choice=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter id");
			int id=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter name");
			String name=sc.nextLine();
			
			System.out.println("Enter base salary");
			double baseSalary=sc.nextDouble();
			
			switch(choice)
			{
				case 1:
				emp[i]=new Employee(id,name,baseSalary);
				break;
				
				case 2:
				System.out.println("Enter bonus");
				double bonus=sc.nextDouble();
				emp[i]=new Manager(id,name,baseSalary,bonus);
				break;
				
				case 3:
				System.out.println("Enter internship duration");
				int duration=sc.nextInt();
				emp[i]=new Intern(id,name,baseSalary,duration);
				break;
				
				default:
				System.out.println("Invalid choice! please try again");
				i--;
			}
			System.out.println();
		}
		
		// Displaying the final salary of each employee
		System.out.println("Employee details");
		for(int i=0; i<emp.length; i++)
		{
			if(emp[i]!=null)
			{
				emp[i].displayDetails();
				System.out.println();
			}
		}
	}
}