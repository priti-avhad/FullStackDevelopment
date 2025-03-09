import java.util.*;
class Vehicle
{
	private String vehicleModel;
	private String RegistrationNo;
	private double speed;
	private double FuelCapacity;
	private double FuelConsumption;
	
	public Vehicle(String vehicleModel, String RegistrationNo, double speed, double FuelCapacity, double FuelConsumption)
	{
		this.vehicleModel=vehicleModel;
		this.RegistrationNo=RegistrationNo;
		this.speed=speed;
		this.FuelCapacity=FuelCapacity;
		this.FuelConsumption=FuelConsumption;
	}
	public String getVehicleModel()
	{
		return vehicleModel;
	}
	public String getRegistrationNo()
	{
		return RegistrationNo;
	}
	public double getSpeed()
	{
		return speed;
	}
	public double getFuelCapacity()
	{
		return FuelCapacity;
	}
	public double getFuelConsumption()
	{
		return FuelConsumption;
	}
	
	public void setFuelConsumption(double FuelConsumption)
	{
		this.FuelConsumption=FuelConsumption
	}
	
	 // Method to calculate fuel needed for a given distance
	 public double FuelNeeded(double distance)
	 {
		 return distance/FuelConsumption;
	 }
	 
	 //method to calculate distance covered in given time
	 public double distanceCovered(double time)
	 {
		 return VehicleSpeed*time;
	 }
	 //display method to display all details
	 public void display()
	 {
		 System.out.println("vehicle model is"+vehicleModel);
		 System.out.println("Registration no is"+RegistrationNo);
		 System.out.println("vehicle speed is"+speed);
		 System.out.println("fuel capacity is"+FuelCapacity);
		 System.out.println("fuel consumption is"+FuelConsumption);
	 }
}

class Truck extends Vehicle
{
	//parameterised constructor
	private double CargoWeightLimit;
	public Truck(String vehicleModel, String RegistrationNo, double speed, double FuelCapacity, double FuelConsumption, double CargoWeightLimit)
	{
		super(vehicleModel, RegistrationNo, speed,FuelCapacity, FuelConsumption);
		this.CargoWeightLimit=CargoWeightLimit;
	}
	
	//getter setter
	public void setCargoWeightLimit(double CargoWeightLimit)
	{
		this.CargoWeightLimit=CargoWeightLimit;
	}
	public double getCargoWeightLimit()
	{
		return CargoWeightLimit;
	}
	
	//override display method
	public void display()
	{
		super.display();
		System.out.println("cargo weight limit"+CargoWeightLimit+"kg");;
	}
}

class Bus extends Vehicle
{
	//parameterised constructor
	private int NoOfPassengers;
	public Bus(String vehicleModel, String RegistrationNo, double speed, double FuelCapacity, double FuelConsumption, int NoOfPassengers)
	{
		super(vehicleModel, RegistrationNo, speed, FuelCapacity, FuelConsumption,NoOfPassengers);
		this.NoOfPassengers=NoOfPassengers;
	}
	//getter setter
	public void setNoOfPassengers(int NoOfPassengers)
	{
		this.NoOfPassengers=NoOfPassengers;
	}
	public int getNoOfPassengers()
	{
		return NoOfPassengers;
	}
	
	public void display()
	{
		super.display();
		System.out.println("no of passengers is"+NoOfPassengers);
	}
}

public class TransportVehicleApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter vehicle details");
		System.out.println("Enter Vehicle model");
		String vehicleModel=sc.nextLine();
		
		System.out.println("Enter vehicle Registration number");
		String RegistrationNo=sc.nextLine();
		
		System.out.println("Enter Speed of vehicle");
		Double speed=sc.nextDouble();
		
		System.out.println("Enter fuel capacity of vehicle");
		double FuelCapacity=sc.nextDouble();
		
		System.out.println("Enter fuel consumption of vehicle");
		double FuelConsumption=sc.nextDouble();
		
		System.out.println("Enter number of passengers");
		int NoOfPassengers=sc.nextInt();
		
		 Truck truck = new Truck(truckModel, truckRegNum, truckSpeed, truckFuelCapacity, truckFuelConsumption, cargoWeightLimit);
		 
		System.out.print("Enter distance for fuel calculation for Truck (km): ");
        double truckDistance = scanner.nextDouble();
        System.out.print("Enter time for distance calculation for Truck (hours): ");
        double truckTime = scanner.nextDouble();
		
		System.out.println("\nTruck Details:");
        truck.display();
        System.out.println("Fuel Needed for " + truckDistance + " km: " + truck.fuelNeeded(truckDistance) + " liters");
        System.out.println("Distance Covered in " + truckTime + " hours: " + truck.distanceCovered(truckTime) + " km");
        System.out.println();
		
		
		sc.nextLine();
		
		  System.out.println("Enter Bus Details:");
        System.out.print("Vehicle Model: ");
        String busModel = scanner.nextLine();
        System.out.print("Registration Number: ");
        String busRegNum = scanner.nextLine();
        System.out.print("Vehicle Speed (km/h): ");
        double busSpeed = scanner.nextDouble();
        System.out.print("Fuel Capacity (liters): ");
        double busFuelCapacity = scanner.nextDouble();
        System.out.print("Fuel Consumption (km/l): ");
        double busFuelConsumption = scanner.nextDouble();
        System.out.print("Number of Passengers: ");
        int noOfPassengers = scanner.nextInt();
		
		
		Bus b=new Bus(busModel, busRegNo, busSpeed, busFuelCapacity, busFuelConsumptio, NoOfPassengers);
		
		System.out.println("Enter distance for fuel calculation for bus");
		double busDistance=sc.nextDouble();
		System.out.print("Enter time for distance calculation for bus");
		double busTime=sc.nextDouble();
		
		 System.out.println("\nBus Details:");
        bus.display();
        System.out.println("Fuel Needed for " + busDistance + " km: " + bus.fuelNeeded(busDistance) + " liters");
        System.out.println("Distance Covered in " + busTime + " hours: " + bus.distanceCovered(busTime) + " km");

        scanner.close();
		
	}
}