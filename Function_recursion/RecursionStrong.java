import java.util.*;
public class RecursionStrong
{
    static boolean b;
    public static void main(String x[])
    {
       int no;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       no=sc.nextInt();
       b=false;
       boolean isStrong=strongNumber(no);

     if(isStrong)
                 {
                    System.out.println("Number is strong");
                 }
      else
             {
                System.out.println("Number is not strong");
             }
    }
     
       public static boolean strongNumber(int x) 
          {
              int sum = sumFactorials(x); 
              return x == sum;            
           }

    public static int sumFactorials(int x) 
        {
        if (x==0) {
            return 0;
        }
        return factorial(x%10)+sumFactorials(x/10); 
    }

    public static int factorial(int n) 
       {
        if (n<=1) 
         {
            return 1;
         }
        return n * factorial(n - 1);
    }
  }

    

