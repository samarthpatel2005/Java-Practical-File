import java.util.Scanner;

public class pra5 {
    static int s = 10;
    public static void main(String[] args) {
        int a;
       
        int price[] = {200,550,100,170,220};
        System.out.println("1-Motor\n2-Fan\n3-Tube\n4-wires\n5-All other item");
        System.out.print("Enter your choice :");
        Scanner b = new Scanner(System.in);
        a = b.nextInt();

        switch (a) {
            case 1 -> System.out.println("The price of the Motor is :"+(price[0]+price[0]*0.08f));
            case 2 -> System.out.println("The price of the Fan is :"+(price[1]+price[1]*0.12f));
            case 3 -> System.out.println("The price of the Tubes is :"+(price[2]+price[2]*0.075f));
            case 4 -> System.out.println("The price of the wires is :"+(price[3]+price[3]*0.03f));
            default -> System.out.println("Invalid choice");
        }
        System.out.println(s);
    }
}
