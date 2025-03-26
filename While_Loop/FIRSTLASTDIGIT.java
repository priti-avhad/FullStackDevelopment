import java.util.*;

public class FIRSTLASTDIGIT 
{
public static void main(String[] args) 
{
int no,firstDigit,lastDigit;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number: ");
no= sc.nextInt();
lastDigit = no % 10;
        
while (no >= 10) 
{
no /= 10;
}
firstDigit = no;
System.out.println("First digit is : " + firstDigit);
System.out.println("Last digit is: " + lastDigit);
}
}
