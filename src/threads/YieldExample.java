package threads;

public class YieldExample {
    public static void main(String[] args) throws InterruptedException {
        YieldThreadA threadA = new YieldThreadA();
        YieldThreadB threadB = new YieldThreadB();

        threadA.start();
        threadB.start();

        // Run threadB
        Thread.sleep(10);
        threadA.work = false;

        // Run and take turn threadA,B
        Thread.sleep(10);
        threadA.work = true;

        // Finish both threads
        Thread.sleep(10);
        threadA.stop = true;
        threadB.stop = true;
    }
}

class YieldThreadA extends Thread {
    public boolean stop = false;
    public boolean work = true;

    @Override
    public void run() {
        while (!stop) {
            if (work) {
                System.out.println("ThreadA is Working");
            } else {
                // Give priority to another thread
                Thread.yield();
            }
        }
    }
}

class YieldThreadB extends Thread {
    public boolean stop = false;
    public boolean work = true;

    @Override
    public void run() {
        while (!stop) {
            if (work) {
                System.out.println("ThreadB is Working");
            } else {
                // Give priority to another thread
                Thread.yield();
            }
        }
    }
}