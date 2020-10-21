package threads;

public class PriorityExample {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            Thread thread = new CalThread("thread"+i);
            if(i!=10){
                thread.setPriority(Thread.MIN_PRIORITY);
            }else{
                thread.setPriority(Thread.MAX_PRIORITY);
            }
            thread.start();
        }
    }
}

class CalThread extends Thread {
    public CalThread(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 2000000000; i++) {
        }
        System.out.println(this.getName());
    }
}
