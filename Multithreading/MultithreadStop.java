class MyThread extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1; i<=5; i++)
			{
				System.out.printf("First thread=%d\n",i);
				if(i==3)
				{
					break;
				}
				sleep(10000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
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
				System.out.printf("second thread is=%d\n",i);
				sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		}
	}
}
public class MultithreadStop
{
	public  static void main(String x[])
	{
		MyThread m=new MyThread();
		m.start();
		MyThread1 m1=new MyThread1();
		m1.start();
	}
}