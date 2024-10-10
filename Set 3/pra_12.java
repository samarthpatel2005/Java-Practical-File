import java.util.Scanner;
public class pra_12 {
    public static void main(String[] args) {
        
        if (args.length > 0) {
            double pounds = Double.parseDouble(args[0]);
            double rupees = pounds * 100.0;
            System.out.println(pounds + " Pounds is equal to " + rupees + " Rupees");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the amount in Pounds: ");
            double pounds = scanner.nextDouble();
            double rupees = pounds * 100.0;
            System.out.println(pounds + " Pounds is equal to " + rupees + " Rupees");
        }
    }
}