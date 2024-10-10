class RandomNumberGenerate extends Thread {

    public void run() {
        int i = 0;
        while (i <= 5) {
            int randomNum = (int) (Math.random() * 100);
            System.out.println("Generated Random Number: " + randomNum);
            if (randomNum % 2 == 0) {
                new SquareThread(randomNum).start();
            } else {
                new CubeThread(randomNum).start();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class SquareThread extends Thread {

    private int number;

    SquareThread(int n) {
        number = n;
    }

    public void run() {
        int square = number * number;
        System.out.println("Square of " + number + " is: " + square);
    }
}

class CubeThread extends Thread {

    private int number;

    CubeThread(int n) {
        number = n;
    }

    public void run() {
        int cube = number * number * number;
        System.out.println("Cube of " + number + " is: " + cube);
    }
}

public class pra_34 {

    public static void main(String[] args) {
        RandomNumberGenerate rng = new RandomNumberGenerate();
        rng.start();
        System.out.println("23DCS089_Samarth");
    }
}
