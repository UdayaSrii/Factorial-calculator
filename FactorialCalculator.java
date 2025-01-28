import java.util.Scanner; 
public class FactorialCalculator {
    // Create a method to calculate the factorial of a number
    public static void main(String[] args) {
        // Create a new Scanner object to get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int num = sc.nextInt();
        long factorial = 1;
        // Create a loop to calculate the factorial of the number
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            // Print the result
            System.out.println("Factorial of " + num + " is: " + factorial);
        }
    }
}


