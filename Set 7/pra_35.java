import java.util.Scanner;

class IncrementThread extends Thread {

    int number;

    IncrementThread(int n) {
        number = n;
    }

    public void run() {
        int i = 0;
        while (i < 5) {
            number++;
            System.out.println("Incremented Value: " + number);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

public class pra_35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int n = scanner.nextInt();
        scanner.close();
        IncrementThread it = new IncrementThread(n);
        it.start();
        System.out.println("23DCS089_Samarth");
    }
}
