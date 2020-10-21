package threads;

import java.util.concurrent.*;

public class ThreadGroupExample {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("myGroup");
        WorkThread threadA = new WorkThread(group, "threadA");
        WorkThread threadB = new WorkThread(group, "threadB");

        threadA.start();
        threadB.start();

        // Get current thread group
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        mainGroup.list();

        Thread.sleep(3000);

        group.interrupt();

        // Initial Thread : 0
        // Core thread : 0  (Minimum thread when it's created)
        // Max Thread : Integer.MAX_VALUE
        ExecutorService pool1 = Executors.newCachedThreadPool();

        // Initial Thread : 0
        // Core thread : parameter  (Minimum thread when it's created)
        // Max Thread : parameter
        ExecutorService poo2 = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        ExecutorService pool3 = new ThreadPoolExecutor(
                3, // Core Thread
                100, // Max Thread
                120L, // Free Time => destroy after this time if it's free
                TimeUnit.SECONDS, // Unit of time
                new SynchronousQueue<Runnable>() // Queue
        );

    }
}

class WorkThread extends Thread {
    public WorkThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
