import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

        Complex(double r, double i) {
        real = r;
        imaginary = i;
    }

        void Sum(Complex other) {
        double sumReal = real + other.real;
        double sumImaginary = imaginary + other.imaginary;
        System.out.println("Sum: " + sumReal + " + " + sumImaginary + "i");
    }

        void Difference(Complex other) {
        double diffReal = real - other.real;
        double diffImaginary = imaginary - other.imaginary;
        System.out.println("Difference: " + diffReal + " + " + diffImaginary + "i");
    }

        void Product(Complex other) {
        double productReal = real * other.real - imaginary * other.imaginary;
        double productImaginary = real * other.imaginary + imaginary * other.real;
        System.out.println("Product: " + productReal + " + " + productImaginary + "i");
    }
}
public class pra_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imaginary1 = scanner.nextDouble();
        
        System.out.print("Enter the real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double imaginary2 = scanner.nextDouble();
        
        Complex complex1 = new Complex(real1, imaginary1);
        Complex complex2 = new Complex(real2, imaginary2);

        complex1.Sum(complex2);
        complex1.Difference(complex2);
        complex1.Product(complex2);

        System.out.println("23DCS089_Samarth Patel");
    }
}
