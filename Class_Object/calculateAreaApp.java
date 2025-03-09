import java.util.*;
abstract class Area
{
	abstract void showArea();
}

class Circle extends Area
{
	int radius;
	void setRadius(int radius)
	{
		this.radius=radius;
	}
	void showArea()
	{
		double AreaCircle=(3.14f)*radius*radius;
		System.out.println("Area of circle is: "+AreaCircle);
	}
}

class Rectangle extends Area
{
	int length;
	int width;
	void setLengtWidth(int length, int width)
	{
		this.length=length;
		this.width=width;
	}
	void showArea()
	{
		int AreaRec=length*width;
		System.out.println("Area of rectangle is :"+AreaRec);
	}
}

public class CalculateAreaApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details to find area");
		System.out.println("Enter the radius");
		int radius=sc.nextInt();
		System.out.println("Enter length");
		int length=sc.nextInt();
		System.out.println("Enter width");
		int width=sc.nextInt();
		
		Circle c=new Circle();
		c.setRadius(radius);
		c.showArea();
		
		Rectangle r=new Rectangle();
		r.setLengtWidth(length,width);
		r.showArea();
	}
}
