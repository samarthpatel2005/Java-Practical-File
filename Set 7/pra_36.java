class CustomThread extends Thread {
    public CustomThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Running thread: " + getName() + " with priority: " + getPriority());
    }
}

public class pra_36 {
    public static void main(String[] args) {
        CustomThread firstThread = new CustomThread("FIRST");
        CustomThread secondThread = new CustomThread("SECOND");
        CustomThread thirdThread = new CustomThread("THIRD");

        firstThread.setPriority(3);
        // secondThread.setPriority(Thread.NORM_PRIORITY);
        thirdThread.setPriority(7);

        firstThread.start();
        secondThread.start();
        thirdThread.start();
    }
}
