import java.io.*;
public class FetchFiles
{
	public static void main(String x[])
	{
		File f=new File("C:\\Users\\Lenovo\\Desktop\\Full Stack Development\\Core java\\Practical");
		File list[]=f.listFiles();
		for(int i=0; i<list.length; i++)
		{
			System.out.println(list[i]);
		}
	}
}