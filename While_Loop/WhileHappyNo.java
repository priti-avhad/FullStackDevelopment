import java.util.*;
  public class WhileHappyNo
  {
    public static void main(String x[])
   {
      int no,sum,rem;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      no=sc.nextInt();
      
      while(no!=1 && no!=4)
      {
        sum=0;
        while(no>0)
      {
       rem=no%10;
       sum=sum+(rem*rem);
       no=no/10;
   } 
      no=sum;
  }
     if(no==1)
   {
      System.out.println("Happy Number");
   }
    else
    {
      System.out.println("Not Happy Number");
    }
  }
}