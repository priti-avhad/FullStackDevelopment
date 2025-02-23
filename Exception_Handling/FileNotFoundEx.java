import java.io.*;
public class FileNotFoundEx
{
	public static void main(String x[])
	{
		try
		{
		FileReader fr=new FileReader("D:\\java course.txt");
		int data;
		while((data=fr.read())!=-1)
		{
			char ch=(char)data;
			System.out.print(ch);
		}
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("Error is : "+ex);
		}catch(IOException ex)
		{
			System.out.println("Error is"+ex);
		}
		
	}
}