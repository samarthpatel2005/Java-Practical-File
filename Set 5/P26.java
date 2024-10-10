import java.io.*;

public class P26 {

    public static void readFile(String filePath) throws java.io.IOException {
        FileReader file = null;
        BufferedReader br = null;
        try {
            file = new FileReader(filePath);
            br = new BufferedReader(file);
            System.out.println(br.readLine());
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } finally {
            if (br != null) {
                br.close();  // Ensures the BufferedReader is closed
            }
            if (file != null) {
                file.close();  // Ensures the FileReader is closed
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // Handling ArithmeticException (fixed by avoiding division by zero)
        try {
            int a = 10 / 2;  // Fixed divisor
            System.out.println("Result of division: " + a);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception caught: " + e);
        }

        // Handling NullPointerException (fixed by initializing the string)
        try {
            String str = "Hello";  // Fixed by assigning a non-null value
            System.out.println("String length: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Unchecked Exception caught: " + e);
        }

        // Handling FileNotFoundException in readFile method
        readFile("nonexistentfile.txt");

        // Handling ClassNotFoundException (fixed by using a valid class)
        try {
            Class.forName("java.lang.String");  // Using a valid class name
            System.out.println("Class found.");
        } catch (ClassNotFoundException e) {
            System.out.println("Checked Exception caught: " + e);
        }
    }
}
