import java.io.*;
public class Freespace
{
	public static void main(String x[])
	{
		File drives[]=File.listRoots();
		for(int i=0; i<drives.length; i++)
		{
			long totalspace=drives[i].getTotalSpace();
			long freespace=drives[i].getFreeSpace();
			
			System.out.println(drives[i]+"\t"+(totalspace/1073741824)+"GB\t"+(freespace/1073741824)+" GB");
		}
	}
}