import java.io.*;
public class TotalSpaceCheck
{
	public static void main(String x[])
	{
		File drives[]=File.listRoots();
		for(int i=0; i<drives.length; i++)
		{
			//this methos shows total space of our drive
			long totalspace=drives[i].getTotalSpace();
			long freespace=drives[i].getFreeSpace();
			System.out.println(drives[i]+"\t"+totalspace+"\t"+freespace);
		}
	}
}