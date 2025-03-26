import java.util.*;

public class StrongNumberCheck
{
public static void main(String x[])
{
int no, originalNo, rem, sum = 0;
boolean flag = false;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
no = sc.nextInt();
originalNo = no;

while(no != 0) 
{
rem = no % 10;
sum += factorial(rem);
no = no / 10;
}

if(sum == originalNo) 
{
flag = true;
}

if(flag) 
{
System.out.println("Number is strong");
}
else 
{
System.out.println("Number is not strong");
}
}

public static int factorial(int num)
{
int fact = 1;
for(int i = 1; i <= num; i++) {
fact *= i;
}
return fact;
}
}
