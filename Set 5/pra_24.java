import java.util.Scanner;

public class pra_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the first integer (x): ");
            int x = scanner.nextInt();
            
            System.out.print("Enter the second integer (y): ");
            int y = scanner.nextInt();
            
            int result = x / y;
            System.out.println("Result: " + result);
            
        } catch (Exception e) {
            if (e instanceof ArithmeticException) {
                System.out.println("Error: Division by zero is not allowed.");
            } else {
                System.out.println("Error: Please enter valid integers.");
            }
        }
        System.out.println("23DCS089_Samarth");
    }
}

