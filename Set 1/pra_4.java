import java.util.*;

public class pra_4 {
    public static void main(String[] args) {
        float sum = 0;
        int n;
        int[] arr = new int[30];
        System.out.println("Enter the number of days:");
        Scanner b = new Scanner(System.in);
        n = b.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = b.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("The total expense is: " + sum);
        System.out.println("23DCS089_SAMARTH PATEL");
    }
}