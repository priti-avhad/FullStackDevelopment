class Table
{
	synchronized void showTable(int x)
	{
		try
		{
			for(int i=1; i<=10; i++)
			{
				System.out.printf("%d x %d=%d\n",i,x,i*x);
				if(i==5)
				{
					wait(60000);
				}
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		}
	}
}

class Two extends Thread
{
	Table table;
	void setTable(Table table)
	{
		this.table=table;
	}
	
	public void run()
	{	
		table.showTable(2);
	}
}

class Three extends Thread
{
	Table table;
	void setTable(Table table)
	{
		this.table=table;
	}
	
	public void run()
	{
		table.showTable(3);
	}
}
public class CondWait
{
	public static void main(String x[])
	{
		Table tt=new Table();
		Two tw=new Two();
		tw.setTable(tt);
		tw.start();
		
		Three th=new Three();
		th.setTable(tt);
		th.start();
	}
}