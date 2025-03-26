import java.util.*;
public class HappyNoApp
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int no,sum,rem;
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
if(no == 1)
{
System.out.println("Happy number");
}
else
{
System.out.println("Not haappy number");
}
}
}