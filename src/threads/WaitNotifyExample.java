package threads;

public class WaitNotifyExample {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject();

        NotifyThreadA threadA = new NotifyThreadA(sharedObject);
        NotifyThreadB threadB = new NotifyThreadB(sharedObject);

        threadA.start();
        threadB.start();
    }
}

class WorkObject {
    public synchronized void methodA() {
        // Let WaitThreadB be Runnable State
        notify();

        // Let WaitThreadA be Pause State
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void methodB() {
        // Let WaitThreadA be Runnable State
        notify();

        // Let WaitThreadB be Pause State
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class NotifyThreadA extends Thread {
    private WorkObject workObject;

    public NotifyThreadA(WorkObject workObject) {
        this.workObject = workObject;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            workObject.methodA();
        }
    }
}

class NotifyThreadB extends Thread {
    private WorkObject workObject;

    public NotifyThreadB(WorkObject workObject) {
        this.workObject = workObject;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            workObject.methodB();
        }
    }
}
