import java.io.*;
public class ListRoots
{
	public static void main(String x[])
	{
		//this method find roots of our pc
		File drives[]=File.listRoots();
		for(int i=0; i<drives.length; i++)
		{
			System.out.println(drives[i]);
		}
	}
}