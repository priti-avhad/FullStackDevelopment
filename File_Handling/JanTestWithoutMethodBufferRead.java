/*Q3. WAP to read the file by using BufferedWriter and find the following things from file
	a. finds the number of lines   & number of words 
	c. finds the number of digits */
	
	
import java.util.*;
import java.io.*;

public class JanTestWithoutMethodBufferRead
{
	public static void main(String x[])throws Exception
	{
		File f=new File("D:\\FileHandling\\file.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		int lineCount=0;
		int WordCount=0;
		int digitCount=0;
		String line;
		
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
			lineCount++;
			
			//count words
			int wordflag=0;
			for(int i=0; i<line.length(); i++)
			{
				char c=line.charAt(i);
				if(c!=' ' && c!='\t')
				{
					wordflag=1;
				}
				else if(wordflag==1)
				{
					WordCount++;
					wordflag=0;
				}
			}
			if(wordflag==1)
			{
				WordCount++;
			}
			
			//counting digits manually
			for(int i=0; i<line.length(); i++)
			{
				char c=line.charAt(i);
				if(c>='0' && c<='9')
				{
					digitCount++;
				}
			}
			Thread.sleep(4000);
			System.out.println("total lines : "+lineCount);
			System.out.println("total digits :"+WordCount);
			System.out.println("total digits :"+digitCount);
			br.close();
		}
		
	}
}