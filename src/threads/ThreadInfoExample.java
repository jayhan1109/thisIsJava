package threads;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setName("AutoSaveThread");
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        // Get all threads in the process
        Map<Thread,StackTraceElement[]> map = Thread.getAllStackTraces();

        // Parse only keys from Map
        Set<Thread> threads = map.keySet();
        for(Thread thread:threads){
            System.out.println("Name : "+thread.getName());
            // get Thread Group name
            System.out.println("Group : "+thread.getThreadGroup().getName());
        }
    }
}
