import java.util.*;

public class MULTIPLICATIONTABLE 
{
public static void main(String x[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
int no = sc.nextInt();
        
int i = 1;
while (i <= 10) 
{
System.out.println(no + " x " + i + " = " + (no * i));
i++;
}
}
}

