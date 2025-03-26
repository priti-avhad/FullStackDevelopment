import java.util.*;
public class Whilefactorialno
{
   public static void main(String x[])
  {
     int no,i,f=1;
     Scanner sc=new Scanner(System.in);
     System.out.printf("Enter the number");
     no=sc.nextInt();
     i=1;
     
    while(i<=no)
    {
     f=f*i;
     i++; 
    }
     System.out.printf("Fcatorial is %d\n",f);
  }
}