import java.util.*;

public class DuckNumbers 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n:");
int n = sc.nextInt();

int count = 0;
int number = 1;

while (count < n) 
{
if (isDuck(number))
{
switch (1) 
{
case 1:
System.out.println(number);
break;
default:
break;
}
count++;
}
number++;
}
}

public static boolean isDuck(int number) 
{
String numStr = Integer.toString(number);
int len = numStr.length();
for (int i = 1; i < len; i++) 
{

if (numStr.charAt(i) == '0') 
{
return true;
}
}
return false;
}
}
