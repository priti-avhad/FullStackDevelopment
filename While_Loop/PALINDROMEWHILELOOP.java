import java.util.*;
public class Palindrome
{
public static void main(String x[])
{
int no,reverse,originalno;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
no=sc.nextInt();

originalno=no;
reverse=0;
while(no!=0)
{
reverse=reverse*10+(no%10);
no/=10;
}

if(originalno==reverse)
{
System.out.println("it is a palindrome");
}
else
{
System.out.println("it is not a palindrome");
}
}
}