import java.io.*;
import java.util.*;
public class FileWriteApp
{
	public static void main(String x[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter single character in file");
		char ch=sc.nextLine().charAt(0);
		FileWriter fw = new FileWriter("C:\\Users\\Lenovo\\Desktop\\Full Stack Development\\Core java\\Practical\\filehand.doc", true);
		
		fw.write(ch);
		fw.close();
		System.out.println("Data save success");
	}
}