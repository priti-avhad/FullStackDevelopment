import java.util.*;
public class WhileDuckNo
{
   public static void main(String x[])
  {
    int no,rem;
    boolean flag=false;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number :");
    no=sc.nextInt();

    while(no!=0)
    {
      rem=no%10;
      no=no/10;
   
    if(rem==0)
     {
       flag=true;
       break;
     }
    }
    if(flag)
      {
         System.out.printf("Number is Duck");
      }
     else
      {
         System.out.printf("Number is not duck");
      }
  }
}