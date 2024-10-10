import java.util.Scanner;
public class Pr6 
{
    public static void main(String[] args) {
        int j = 1, k, temp = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; temp <=n; i++) {
            System.out.println(temp);
            k = j;
            j = temp;
            temp = j + k;

            sum += temp;
        }
        System.out.println(sum);
        sc.close();
    }
}