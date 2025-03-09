import java.io.*;
public class Mkdir
{
	public static void main(String x[])
	{
		File f=new File("C:\\Users\\Lenovo\\Desktop\\Full Stack Development\\Core java\\Practical\\practiceFileHand");
		boolean b=f.mkdir();
		if(b)
		{
			System.out.println("folder created successfully");
		}
		else
		{
			System.out.println("some problem is there");
		}
	}
}