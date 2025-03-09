import java.util.*;
import java.io.*;

public class StreamClass
{
	public static void main(String x[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		FileOutputStream fout=new FileOutputStream("D:\\FileHandling\\file.txt");
		System.out.println("Enter string from keyboard");
		String msg=sc.nextLine();
		byte b[]=msg.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("File save success");
	}
}