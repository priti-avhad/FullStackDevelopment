import java.util.*;
public class FuncRecPower
{      
    public static void main(String x[])
    {
        
        int base,index;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base and index");
        base=sc.nextInt();
        index=sc.nextInt();
        int result = functionPower(base,index);
        System.out.printf("Power is %d\n",result);
    }
        public static int functionPower (int base, int index) //definition
       {      
         int p=1;    
	for(int i=1; i<=index;i++)

	{  
           p = p  * base;
	}

             return p;
       }
}