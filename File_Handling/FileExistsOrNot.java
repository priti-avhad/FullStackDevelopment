import java.io.*;
public class FileExistsOrNot
{
	public static void main(String x[])
	{
		File f=new File("C:\\Users\\Lenovo\\Desktop\\Full Stack Development\\Core java\\Practical\\practiceFileHand");
		if(f.exists())
		{
			System.out.println("folder is already present");
		}
		else
		{
			boolean b=f.mkdir();
			if(b)
			{
				System.out.println("folder created successfuly");
			}
			else
			{
				System.out.println("some problem is there");
			}
		}
	}
}