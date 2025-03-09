import java.util.*;
public class FuncRecursionDigitSearch
{
    static boolean b=false;
    public static void main(String x[])
   {
       int no;
       Scanner sc=new Scanner(System.in);
       System.out.println("Input Number");
       no=sc.nextInt();
       System.out.println("Enter digit for search");
       int dsearch=sc.nextInt();
       boolean b=digitsearch(no,dsearch);
       if(b)
        {
           System.out.println("Digit found");
        }
       else
        {
            System.out.println("Digit not fund");
        }
   }
      public static boolean digitSearch(int x,int skey)
       {
         if(x!=0)
           {
              int rem=x%10;
               if(rem==skey)
               {
                  b=true;
                  return b; 
               }
               else 
               {
                  x=x/10;
                  return digitSearch(x,skey);
               }
           }
          else
               {
                  return false;
               }
       }
}