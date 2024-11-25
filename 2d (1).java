import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Create a 2D array with the specified number of rows and columns
        int[][] array = new int[rows][cols];

        // Populate the array using a nested for loop
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Set each element to i * j
                array[i][j] = i * j;
            }
        }

        // Print the array in a table-like format
        System.out.println("\nMultiplication Table:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Print each element with a space for better readability
                System.out.print(array[i][j] + "\t");
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
