import java.util.*;
public class Primenousingflag
{
public static void main(String x[])
{
int no,rem,i;
boolean flag=true;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
no=sc.nextInt();
i=2;
while(i<no)
{
rem=no%i;
if(rem==0)
{
flag=false;
break;
}
i++;
}
if(flag)
{
System.out.println("Number is prime");
}
else
{
System.out.println("Number is not prime");
}
}
}