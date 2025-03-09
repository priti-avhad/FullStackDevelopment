package demo;
import java.io.*;
import java.util.*;
public class ReadAppUsingCsv {

	public static void main(String[] args)throws Exception {
		FileReader fr=new FileReader("D:\\data.csv");
		BufferedReader br=new BufferedReader(fr);
		String line;
		
		while((line=br.readLine())!=null)
		{
			String cols[]=line.split(",");
			for(String col:cols)
			{
				System.out.print(col+"\t");
			}
			System.out.println();
		}

	}

}
