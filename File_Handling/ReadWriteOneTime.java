import java.util.*;
import java.io.*;
public class ReadWriteOneTime
{
	public static void main(String x[])
	{
		String path="D:\\java course.txt";
		Scanner sc=new Scanner(System.in);
		
		try(FileWriter fw=new FileWriter(path,true);
		BufferedWriter br=new BufferedWriter(fw))
		{
			System.out.println("Enter data :");
			String data=sc.nextLine();
			br.write(data);
			br.newLine();
			System.out.println("Data written successfully");
		}
		catch(Exception ex)
		{
			System.out.println("Exception is :"+ex.getMessage());
		}
		
		try(FileReader fr=new FileReader(path);
		BufferedReader br1=new BufferedReader(fr))
		{
			String line;
			
			while((line=br1.readLine())!=null)
			{
				System.out.println(line);
				Thread.sleep(4000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception is"+ex.getMessage());
		}
	}
}