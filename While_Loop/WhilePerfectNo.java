import java.util.*;
public class WhilePerfectNo
{
   public static void main(String x[])
  {
     int no,rem,sum=0,i=1;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number:");
     no=sc.nextInt();
     while(i<no)
   {
        rem=no%i;
        if(rem==0)
      {
        sum+=i;
      }
        i++;
     }
      if(sum==no)
      {
        System.out.println("Number is perfect");
      }
      else
       {
         System.out.println("Number is not perfect");
       }  
     }
   }