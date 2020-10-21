package threads;

import java.awt.*;

public class SleepExample {
    public static void main(String[] args) throws InterruptedException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 10; i++) {
            toolkit.beep();

            // Pause thread for 3 seconds
            Thread.sleep(3000);
        }
    }
}
