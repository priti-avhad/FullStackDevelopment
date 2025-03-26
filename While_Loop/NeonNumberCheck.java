import java.util.*;

public class NeonNumberCheck 
{
    public static void main(String[] args)
{
        int no, square, sumOfDigits = 0;
        boolean isNeon = false;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        no = sc.nextInt();
        
        // Calculate the square of the number
        square = no * no;
        
        // Calculate the sum of digits of the square
        int temp = square;
        while (temp != 0) {
            int rem = temp % 10;
            sumOfDigits += rem;
            temp = temp / 10;
        }
        
        // Check if the sum of the digits of the square is equal to the original number
        if (sumOfDigits == no)
        {
            isNeon = true;
        }
        
        // Output result
        if (isNeon) {
            System.out.println("Number is neon");
        } else {
            System.out.println("Number is not neon");
        }
    }
}
