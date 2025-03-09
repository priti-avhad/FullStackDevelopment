import java.util.*;
import java.io.*;
public class StringDataApp
{
	public static void main(String x[])throws Exception
	{
		FileWriter fw=new FileWriter("D:\\FileHandling\\file.txt",true);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string data into the file");
		String data=sc.nextLine();
		
		fw.write(data);
		fw.close();
		System.out.println("Data save success");
	}
}