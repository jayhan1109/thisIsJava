package threads;

public class DaemonExample {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        Thread.sleep(3000);
    }
}

class AutoSaveThread extends Thread {
    public void save() {
        System.out.println("Auto Save");
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                break;
            }
            save();
        }
    }
}
