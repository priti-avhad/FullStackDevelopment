import java.util.*;

abstract class Employee
{
	private int empid;
	private String name;
	private double basesal;
	
	public Employee(int empid,String name,double basesal)
	{
		this.empid=empid;
		this.name=name;
		this.basesal=basesal;
	}
	public int getEmpid()
	{
		return empid;
	}
	public String getName()
	{
		return name;
	}
	public double getBasesal()
	{
		return basesal;
	}
	
	abstract void calculateSalary();
	
    void displayDetails()
	{
		System.out.println("Employee id is"+empid);
		System.out.println("Employee name is"+name);
		System.out.println("base salary is"+basesal);
	}	
}
class FulltimeEmp extends Employee
{
	private int bonusPercentage;
	public FulltimeEmp(int empid, String name, double basesal, int bonusPercentage)
	{
		super(empid,name,basesal);
		this.bonusPercentage=bonusPercentage;
	}
	void calculateSalary()
	{
		double totalSalary=getBasesal()+(getBasesal()*bonusPercentage/100);
		System.out.println("full time employee total salary is"+totalSalary);
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("bonus percentage is"+bonusPercentage);
	}
	
}
class parttimeEmployee extends Employee
{
	int hoursperweek;
	public parttimeEmployee(int empid, String name, double basesal,int hoursperweek)
	{
		super(empid,name,basesal);
		this.hoursperweek=hoursperweek;
	}
	void calculateSalary()
	{
		double totalsalary=getBasesal()*hoursperweek;
		System.out.println("part-time employee total salary is :"+totalsalary);
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("hourse per week salary is"+hoursperweek);
	}
}
public class PayrollTest
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		//full time employee
		System.out.println("Enter how many employees in full time");
		int no=sc.nextInt();
		Employee[] Full=new FulltimeEmp[no];
		for(int i=0; i<no; i++)
		{
			System.out.println("Enter details of the full time employees");
			System.out.println("Enter employee id");
			int empId=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter employee name");
			String name=sc.nextLine();
			System.out.println("Enter base salary of employee");
			int basesal=sc.nextInt();
			System.out.println("Enter the employee bonus percentage");
			int bonusPercentage=sc.nextInt();
			
			Full[i]=new FulltimeEmp(empId,name,basesal,bonusPercentage);
		}
		System.out.println("-----------------------------------------");
		// part time employee
		System.out.println("Enter how many employees in part time");
		int no1=sc.nextInt();
		Employee[] part=new parttimeEmployee[no1];
		System.out.println("Enter details of the part time employees");
		for(int i=0; i<part.length; i++)
		{
			System.out.println("Enter employee id");
			int empId=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter employee name");
			String name=sc.nextLine();
			System.out.println("Enter base salary of employee");
			int basesal=sc.nextInt();
			System.out.println("Enter the workin hourse per week");
			int hoursperweek=sc.nextInt();
			
			part[i]=new parttimeEmployee(empId,name,basesal,hoursperweek);
		}
		
		System.out.println("-----------------------------------------");
		
		//display and calculate salary
		System.out.println("Full time employees");
				System.out.println();
		for(int i=0; i<Full.length; i++)
		{
			Full[i].calculateSalary();
			Full[i].displayDetails();
		}
		System.out.println("-----------------------------------------");
		
		System.out.println("part time employees");
		System.out.println();
		for(int i=0; i<part.length; i++)
		{
			part[i].calculateSalary();
			part[i].displayDetails();
		}
	}
}