import java.util.*;
public class WhileArmstrong
{
   public static void main(String x[])
  {
    int no,rem,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.printf("Enter the number");
    no=sc.nextInt();
    int temp=no;
    
    while(no!=0)
    {
       rem=no%10;
       sum=sum+(rem*rem*rem);
       no=no/10;
    }
     if(sum==temp)
     {
        System.out.println("Number is armstrong");
     }
     else
    {
       System.out.println("Number is not armstrong");
    }
  }
}