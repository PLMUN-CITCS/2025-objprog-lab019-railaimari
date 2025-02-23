
import java.util.Scanner;

public class FactorialCalculator {

   
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        
        while (number < 0) {
            System.out.print("Enter a non-negative integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("Invalid input. Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); 
            }
        }
        return number;
    }

    
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    
    public static void main(String[] args) {
        int number = getNonNegativeInteger();
        long result = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }
}
