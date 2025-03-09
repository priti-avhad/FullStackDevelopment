/*
Q2. Program to Find the Sum of Two Large Numbers.
Input  : str1 = "7777555511111111", 
         str2 =  "3332222221111"
Output : 7780887733332222
*/
import java.util.*;

class LargeNo {
    private String number;
    
    public LargeNo(String number) 
	{
        this.number=number;
    }
    
    public String getNumber() 
	{
        return number;
    }
    
    public static LargeNo add(LargeNo no1,LargeNo no2) 
	{
        StringBuilder result=new StringBuilder();
        int carry=0,sum;
        int i=no1.getNumber().length()-1, j=no2.getNumber().length()-1;
        
        while (i>=0 || j>=0 || carry!=0) 
		{
            int digit1=(i>=0) ? no1.getNumber().charAt(i)-'0':0;
            int digit2=(j>=0) ? no2.getNumber().charAt(j) -'0':0;
            sum = digit1 + digit2 + carry;
            carry =sum/10;
            result.append(sum % 10);
            i--;
            j--;
        }
        return new LargeNo(result.reverse().toString());
    }
}

public class LargeNoAddition {
    public static void main(String x[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        String no1=sc.nextLine();
        System.out.println("Enter second number");
        String no2=sc.nextLine();
        
        LargeNo num1=new LargeNo(no1);
        LargeNo num2=new LargeNo(no2);
        LargeNo sum=LargeNo.add(num1, num2);
        
        System.out.println("Addition of two large numbers is:"+sum.getNumber());
    }
}
