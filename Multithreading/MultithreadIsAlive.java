import java.lang.*;
class MyThread extends Thread
{
	public  void run()
	{
		try
		{
			for(int i=1; i<=5; i++)
			{
				System.out.printf("first thread=%d\t%b\n",i,isAlive());
				if(i==3)
				{
					break;
				}
				sleep(10000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
		}
	}
}
class MyThread1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1; i<=50; i++)
			{
				System.out.printf("Second thread is=%d\t%b\n",i,isAlive());
				sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		}
	}
}
public class MultithreadIsAlive
{
	public static void main(String x[])throws InterruptedException
	{
		MyThread m=new MyThread	();
		m.start();
		m.join();
		System.out.println("Now status of first thread is"+m.isAlive());
		MyThread1 m1=new MyThread1();
		m1.start();
	}
}
