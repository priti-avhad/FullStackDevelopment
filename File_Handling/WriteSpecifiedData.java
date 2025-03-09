import java.util.*;
import java.io.*;
public class WriteSpecifiedData
{
	public static void main(String x[])throws Exception
	{
		FileWriter fw=new FileWriter("D:\\FileHandling\\file.txt",true);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string data in file");
		String data=sc.nextLine();
		
		fw.write(data,5,7);
		fw.close();
		System.out.println("Data save success");
	}
}