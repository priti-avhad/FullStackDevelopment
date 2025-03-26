import java.util.*;
public class WhileNeonNumber
{
   public static void main(String x[])
  {
    int no,square,sum=0,rem;
    boolean isNeon=false;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    no=sc.nextInt();
    square=no*no;
    int temp=square;
     
    while(temp!=0)
    {
      rem=temp%10;
      sum+=rem;
      temp=temp/10;
    }
     if(sum==no)
     {
        isNeon=true;
     }
      if(isNeon)
      {
          System.out.println("Number is Neon");
      }
      else
        {
          System.out.println("Number is not Neon");
        }
    }
}