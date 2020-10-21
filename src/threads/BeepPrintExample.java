package threads;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) throws InterruptedException {
        // Get Toolkit instance
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        // Beep sound 5 times
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            Thread.sleep(500);
        }

        // Print "Beep" 5 times
        for (int i = 0; i < 5; i++) {
            System.out.println("Beep");
            Thread.sleep(500);
        }
    }
}
