
public class pra_32 {

    static class HelloWorldThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello World from Thread class");
        }
    }

    static class HelloWorldRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello World from Runnable interface");
        }
    }

    public static void main(String[] args) {
        HelloWorldThread thread = new HelloWorldThread();
        thread.start();
        HelloWorldRunnable runnable = new HelloWorldRunnable();
        Thread thread1 = new Thread(runnable);
        thread1.start();
        System.out.println("23DCS089_Samarth");
    }
}
