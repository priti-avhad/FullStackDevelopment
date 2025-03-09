import java.util.*;
public class RecursionTable
{
      static int count=1;
      public static void main(String x[])
     {
         Scanner sc=new Scanner(System.in);
         int no;
         System.out.println("Enter the number :");
         no=sc.nextInt();
         ShowTable(no);
      }
       public static void ShowTable(int x)
        {
            if(count<=10)
          {
             System.out.printf("%d\t%d\n",count*x,count);
             ++count;
             ShowTable(x);
          }
       }
}