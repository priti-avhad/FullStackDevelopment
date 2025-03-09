import java.util.*;
public class recursionDigitSearch
{
     static boolean b;
     public static void main(String x[])
    {
        int no;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        no=sc.nextInt();
        boolean b=digitSearch(no);
        
         if(b)
              {
                 System.out.println("Number is duck");
              }
         else
              {
                System.out.println("Number is not duck");
               }
      }

         public static boolean digitSearch(int x)
           {
              if(x!=0)
              {
                  int rem=x%10;
                  if(rem==0)
                 {
                   b=true;
                   return b;
                 }
               else
                {
                   x=x/10;
                   return digitSearch(x);
                }
               }
                else
                    {
                      return false;
                    }
           }
}