import java.util.*;
public class EVENSUMEHILE1
{
public static void main(String x[])
{
int no,i,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
no=sc.nextInt();
i=2;
while(i<=no)
{
sum+=i;
i+=2;
}
System.out.printf("sum is %d\n",sum);
}
}