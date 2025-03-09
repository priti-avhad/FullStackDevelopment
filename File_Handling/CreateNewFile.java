import java.io.*;
public class CreateNewFile
{
	public static void main(String x[]) throws Exception
	{
		File f=new File("C:\\Users\\Lenovo\\Desktop\\Full Stack Development\\Core java\\Practical\\filehand.doc");
		boolean b=f.createNewFile();
		if(b)
		{
			System.out.println("file is created");
		}
		else
		{
			System.out.println("some problem is there");
		}
	}
}