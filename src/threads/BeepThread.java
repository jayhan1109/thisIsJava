package threads;

import java.awt.*;

public class BeepThread extends Thread {
    @Override
    public void run() {
        // Get Toolkit instance
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        // Beep sound 5 times
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}
