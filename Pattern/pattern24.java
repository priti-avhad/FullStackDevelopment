/*
1    2    3    4    5 
10   9    8    7    6 
11  12  13  14  15 
20  19  18  17  16 
21  22  23  24  25

*/

public class pattern24 {
    public static void main(String x[]) {
        int k = 1; // Counter for the numbers
        for (int i = 1; i <= 5; i++) { // Outer loop for rows
            int[] row = new int[5]; // Array to store numbers in each row

            // Populate the row with numbers
            for (int j = 0; j < 5; j++) {
                row[j] = k++;
            }

            // Print the row based on the row index
            if (i % 2 == 0) { // Even rows - reverse order
                for (int j = 4; j >= 0; j--) {
                    System.out.print(row[j] + "\t");
                }
            } else { // Odd rows - normal order
                for (int j = 0; j < 5; j++) {
                    System.out.print(row[j] + "\t");
                }
            }
            System.out.println(); // New line after each row
        }
    }
}
