/*Find the First Non-Repeated Character  ?
  Input: "swiss"
  Output: 'w'*/
  
  import java.util.*;
  public class FirstNonRepeatChar
  {
	  public static void main(String x[])
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter a string");
		  String input=sc.nextLine();
		  
		  char result='\0';
		  for(int i=0; i<input.length(); i++)
		  {
			  char currentChar=input.charAt(i);
			  boolean flag=false;
			  
			  for(int j=0; j<input.length(); j++)
			  {
				  if(i!=j && currentChar==input.charAt(j))
				  {
					  flag=true;
					  break;
				  }
			  }
			  
			  if(!flag)
			  {
				  result=currentChar;
				  break;
			  }
		  }
		  
		  if(result!='\0')
		  {
			  System.out.println("first non repeated character is: " + result);
		  }
		  else
		  {
			  System.out.println("no non repeated character found");
		  }
	  }
  }