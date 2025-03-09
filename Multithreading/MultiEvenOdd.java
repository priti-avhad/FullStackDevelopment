import java.util.*;
import java.io.*;

class OddThread extends Thread
{
	private int start;
	private int end;
	
	public OddThread(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	
	public void run()
	{
		try
		{
			for(int i=start; i<=end; i++)
			{
				if(i%2!=0)
				{
					System.out.println("odd thread is :"+i);
					Thread.sleep(500);
				}
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is :"+ex.getMessage());
		}
	}
}

class EvenThread extends Thread
{
	private int start;
	private int end;
	
	public EvenThread(int start, int end)
	{
		this.start=start;
		this.end=end;
	}
	
	public void run()
	{
		try
		{
			for(int i=start; i<=end; i++)
			{
				if(i%2==0)
				{
					System.out.println("Even thread is"+i);
					Thread.sleep(500);
				}
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex.getMessage());
		}
	}
}
public class MultiEvenOdd
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
	try
	{
		System.out.println("Enter start");
		int s=sc.nextInt();
		System.out.println("Enter end :");
		int e=sc.nextInt();
		
		OddThread ot=new OddThread(s,e);
		EvenThread et=new EvenThread(s,e);
		
		ot.start();
		ot.join();
		et.start();
		et.join();
	}
	catch(Exception ex)
	{
		System.out.println("Error is:"+ex.getMessage());
	}
		
		

		
		
	}
}