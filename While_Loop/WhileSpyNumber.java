import java.util.*;
public class WhileSpyNumber
{
    public static void main(String x[])
   {
     int no,sum,product,temp,digit;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
     no=sc.nextInt();
     product=1;
     temp=no;
     sum=0;
     
     while(temp>0)
      {
        digit=temp%10;
        sum+=digit;
        product*=digit;
        temp/=10;
      }
       if(sum==product)
       {
         System.out.println("It is spy number");
       }
       else
        {
          System.out.println("It is not spy number");
        }
   }
}