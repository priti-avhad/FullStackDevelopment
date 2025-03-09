import java.util.*;
import java.io.*;

public class WriteCharAray
{
	public static void main(String x[])throws Exception
	{	
		FileWriter fw=new FileWriter("D:\\FileHandling\\file.txt",true);
		char ch[]=new char[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter single character data in file");
		for(int i=0; i<ch.length; i++)
		{
			ch[i]=sc.nextLine().charAt(0);
		}
		
		fw.write(ch);
		fw.close();
		System.out.println("Data save success");
		
		
	}
}