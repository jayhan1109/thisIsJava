package threads;

public class WaitNotifyExample2 {
    public static void main(String[] args) {
        DataBox sharedDataBox = new DataBox();
        Producer producer = new Producer(sharedDataBox);
        Consumer consumer = new Consumer(sharedDataBox);

        producer.start();
        consumer.start();
    }
}

class DataBox {
    private String data;

    public synchronized String getData() {
        // If data is null, make Consumer thread to Pause State
        if (this.data == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // When data is written, resume from this line
        String returnValue = data;
        System.out.println("Consumer read : " + data);

        // Make data null and make Producer to Runnable State
        data = null;
        notify();
        return returnValue;
    }

    public synchronized void setData(String data) {
        // If data is not null, make Producer thread to Pause State
        if (this.data != null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // When data is null, resume from this line
        this.data = data;
        System.out.println("Producer write : " + data);
        // Make Consumer to Runnable State
        notify();
    }
}

class Producer extends Thread {
    private DataBox sharedDataBox;

    public Producer(DataBox sharedDataBox) {
        this.sharedDataBox = sharedDataBox;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            String data = "Data-" + i;
            sharedDataBox.setData(data);
        }
    }
}

class Consumer extends Thread {
    private DataBox sharedDataBox;

    public Consumer(DataBox sharedDataBox) {
        this.sharedDataBox = sharedDataBox;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            String data = sharedDataBox.getData();
        }
    }
}