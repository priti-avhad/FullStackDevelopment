import java.util.*;

public class ArmstrongNumberCheck 
{
public static void main(String x[]) 
     {
        int no, originalNo, rem, sum = 0, n = 0;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        no = sc.nextInt();
        originalNo = no;

        // Calculate the number of digits
        int temp = no;
        while(temp != 0) {
            n++;
            temp = temp / 10;
        }

        // Check if the number is an Armstrong number
        while(no != 0) {
            rem = no % 10;
            sum += Math.pow(rem, n);
            no = no / 10;
        }

        if(sum == originalNo) {
            flag = true;
        }

        if(flag) {
            System.out.println("Number is armstrong");
        } else {
            System.out.println("Number is not armstrong");
        }
    }
}
