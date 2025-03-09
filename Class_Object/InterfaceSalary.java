/*Q6. You need to create an interface Payable that has a method calculateSalary(). Then,
you will create two classes, FullTimeEmployee and PartTimeEmployee, that implement
the Payable interface.
Requirements:
1. Interface Payable:
o Method calculateSalary(): This method should be used to calculate and return
the salary of an employee.
2. Class FullTimeEmployee:
o Attributes:
▪ String name
▪ double monthlySalary
o Constructor to initialize name and monthlySalary.
o Implements calculateSalary() method to return the monthly salary.
3. Class PartTimeEmployee:
o Attributes:
▪ String name
▪ double hourlyRate
▪ int hoursWorked
o Constructor to initialize name, hourlyRate, and hoursWorked.
o Implements calculateSalary() method to return the total salary based on
hourly rate and hours worked.
4. Main Class:
o In the main class, create instances of both FullTimeEmployee and
PartTimeEmployee.
o Use polymorphism to call the calculateSalary() method of each employee.*/

import java.util.*;

// Payable Interface
interface Payable 
{
    double calculateSalary();
}

// FullTimeEmployee Class
class FullTimeEmployee implements Payable 
	{
    private String name;
    private double monthlySalary;

    // Constructor
    public FullTimeEmployee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    // Implement calculateSalary
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    // To display employee details
    @Override
    public String toString() {
        return "FullTimeEmployee{name='" + name + "', monthlySalary=" + monthlySalary + "}";
    }
}

// PartTimeEmployee Class
class PartTimeEmployee implements Payable {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    // Constructor
    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implement calculateSalary
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    // To display employee details
    @Override
    public String toString() {
        return "PartTimeEmployee{name='" + name + "', hourlyRate=" + hourlyRate + ", hoursWorked=" + hoursWorked + "}";
    }
}

// Main Class
public class InterfaceSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get Full-Time Employee Details
        System.out.println("Enter full-time employee details:");
        System.out.print("Enter name: ");
        String fullName = sc.nextLine();
        System.out.print("Enter monthly salary: ");
        double monthlySalary = sc.nextDouble();

        // Create Full-Time Employee Instance
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(fullName, monthlySalary);

        // Clear buffer
        sc.nextLine();

        // Get Part-Time Employee Details
        System.out.println("Enter part-time employee details:");
        System.out.print("Enter name: ");
        String partName = sc.nextLine();
        System.out.print("Enter hourly rate: ");
        double hourlyRate = sc.nextDouble();
        System.out.print("Enter hours worked: ");
        int hoursWorked = sc.nextInt();

        // Create Part-Time Employee Instance
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(partName, hourlyRate, hoursWorked);

        // Use polymorphism to calculate salary
        Payable[] employees = { fullTimeEmployee, partTimeEmployee };

        // Display salaries
        for (Payable employee : employees) {
            System.out.println(employee);
            System.out.println("Calculated Salary: " + employee.calculateSalary());
            System.out.println();
        }

        sc.close();
    }
}
