import java.io.*;

import java.util.Scanner;

class Employee implements Serializable{
	private int id;
	private String name;
	private double Sal;
	
	public Employee(int id,String name,double Sal){
		this.id=id;
		this.name=name;
		this.Sal=Sal;
		
	}
	public String toString(){
		return "Employee[ID"+ id + ", Name=" + name + ", Salary=" +Sal + "]";
	}
}
public class SerializationDeSerialiation{
	public static void main(String[]args){
		Scanner scn=new Scanner(System.in);
		
		try{
			System.out.println("Enter the Employee Id:");
			int id=scn.nextInt();
			
			scn.nextLine();
			
			System.out.println("Enter the Employee Name:");
			String name=scn.nextLine();
			
			System.out.println("Enter the Employee Salary");
			double Sal=scn.nextDouble();
			
			Employee emp=new Employee(id,name,Sal);
			
			FileOutputStream fos=new FileOutputStream("D:\\java course.txt");
		    ObjectOutputStream  oos=new ObjectOutputStream(fos);
			oos.writeObject(emp);
			
			oos.close();
			fos.close();
			
			System.out.println("Data written successfully");
			
		
			FileInputStream fis=new FileInputStream ("D:\\java course.txt");
		    ObjectInputStream ois=new ObjectInputStream(fis);
			Employee deserlizedemp=(Employee)ois.readObject();
			
			ois.close();
		    fis.close();
			
			System.out.println("Deserlization employee:"+deserlizedemp);
		}catch(Exception e){
			System.out.println("Error:"+e);
		}
			
	}
		
}