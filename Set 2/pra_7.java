import java.util.*;

public class pra_7 {

    public static void main(String[] args) {
        String st = "chocolate";
        String st1 = "Abc";
        int n, m;
        Scanner b = new Scanner(System.in);
        System.out.println("Enter the number of times you want to print the first 3 characters of the string");
        n = b.nextInt();
        System.out.println("Enter the number of times you want to print the first 3 characters of the string");
        m = b.nextInt();
        System.out.println("--------------------");
        for (int i = 0; i < n; i++) {

            System.out.print(st.substring(0, 3));
        }
        System.out.println("\n--------------------");
        for (int i = 0; i < m; i++) {

            System.out.print(st.substring(0, 3));
        }
        System.out.println("\n--------------------");
        for (int i = 0; i < m; i++) {
            System.out.print(st1.substring(0, 3));
        }
        System.out.println("\n23DCS089_Samarth Patel");

    }
}