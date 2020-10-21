package threads;

public class ThreadNameExample {
    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();
        System.out.println("Main Thread : " + mainThread.getName());

        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        threadA.start();
        threadB.start();
    }
}

class ThreadA extends Thread {
    public ThreadA() {
        this.setName("ThreadA");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++)
            System.out.println(this.getName() + " printed");
    }
}

class ThreadB extends Thread {
    public ThreadB() {
        this.setName("ThreadB");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(this.getName() + " printed");
        }
    }
}
