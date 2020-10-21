package threads;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        SumThread sumThread = new SumThread();
        sumThread.start();

        // Wait sumThread's run method to finish
        sumThread.join();
    }
}

class SumThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("SumThread");
        }
    }
}