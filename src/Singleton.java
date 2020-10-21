public class Singleton {
    private static Singleton s = new Singleton();

    private Singleton() {
    }

    static Singleton getInstance() {
        return s;
    }
}
