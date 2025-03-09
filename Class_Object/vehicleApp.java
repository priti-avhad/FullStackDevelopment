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
		this.FuelConsumption=FuelConsumption;
	}
	
	 // Method to calculate fuel needed for a given distance
	 public double FuelNeeded(double distance)
	 {
		 return distance/FuelConsumption;
	 }
	 
	 //method to calculate distance covered in given time
	 public double distanceCovered(double time)
	 {
		 return speed*time;
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
		super(vehicleModel, RegistrationNo, speed, FuelCapacity, FuelConsumption);
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

public class VehicleApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		// Input details for Truck
        System.out.println("Enter Truck Details:");
        System.out.print("Vehicle Model: ");
        String truckModel = sc.nextLine();
        System.out.print("Registration Number: ");
        String truckRegNum = sc.nextLine();
        System.out.print("Speed (km/h): ");
        double truckSpeed = sc.nextDouble();
        System.out.print("Fuel Capacity (liters): ");
        double truckFuelCapacity = sc.nextDouble();
        System.out.print("Fuel Consumption (km/l): ");
        double truckFuelConsumption = sc.nextDouble();
        System.out.print("Cargo Weight Limit (kg): ");
        double cargoWeightLimit = sc.nextDouble();
		
		 Truck truck = new Truck(truckModel, truckRegNum, truckSpeed, truckFuelCapacity, truckFuelConsumption, cargoWeightLimit);

        System.out.print("Enter distance for fuel calculation for Truck (km): ");
        double truckDistance = sc.nextDouble();
        System.out.print("Enter time for distance calculation for Truck (hours): ");
        double truckTime = sc.nextDouble();

        System.out.println("\nTruck Details:");
        truck.display();
        System.out.println("Fuel Needed for " + truckDistance + " km: " + truck.FuelNeeded(truckDistance) + " liters");
        System.out.println("Distance Covered in " + truckTime + " hours: " + truck.distanceCovered(truckTime) + " km");
        System.out.println();
		
		
		System.out.println("Enter details for bus");
		
		
		 sc.nextLine(); // Clear scanner buffer
        System.out.println("Enter Bus Details:");
        System.out.print("Vehicle Model: ");
        String busModel = sc.nextLine();
        System.out.print("Registration Number: ");
        String busRegNum = sc.nextLine();
        System.out.print("Speed (km/h): ");
        double busSpeed = sc.nextDouble();
        System.out.print("Fuel Capacity (liters): ");
        double busFuelCapacity = sc.nextDouble();
        System.out.print("Fuel Consumption (km/l): ");
        double busFuelConsumption = sc.nextDouble();
        System.out.print("Number of Passengers: ");
        int noOfPassengers = sc.nextInt();

        Bus bus = new Bus(busModel, busRegNum, busSpeed, busFuelCapacity, busFuelConsumption, noOfPassengers);

        System.out.print("Enter distance for fuel calculation for Bus (km): ");
        double busDistance = sc.nextDouble();
        System.out.print("Enter time for distance calculation for Bus (hours): ");
        double busTime = sc.nextDouble();

        System.out.println("\nBus Details:");
        bus.display();
        System.out.println("Fuel Needed for " + busDistance + " km: " + bus.distanceCovered(busDistance) + " liters");
        System.out.println("Distance Covered in " + busTime + " hours: " + bus.distanceCovered(busTime) + " km");

		
	}
}