package threads;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        User1 user1 = new User1();
        User2 user2 = new User2();

        user1.setCalculator(calculator);
        user2.setCalculator(calculator);

        user1.start();
        user2.start();
    }
}

class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    // When setMemory method calls, Calculator instance locks
    // Other threads cannot use this method, other synchronized method, synchronized block
    public synchronized void setMemory(int memory) throws InterruptedException {
        this.memory = memory;
        Thread.sleep(200);
    }

    // Same as following method
    // I put this as shared object
    // so, all synchronized block & methods of Calculator instance locks
    /*
    public void setMemory(int memory) throws InterruptedException {
        synchronized (this) {
            this.memory = memory;
            Thread.sleep(200);
        }
    }
    */
}

class User1 extends Thread {
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        try {
            calculator.setMemory(100);
        } catch (Exception e) {
        }
    }
}

class User2 extends Thread {
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        try {
            calculator.setMemory(50);
        } catch (Exception e) {
        }
    }
}