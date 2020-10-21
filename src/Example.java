

public class Example {
    public static void main(String[] args) {
        // Without overriding equals()
        // equals() method compare the object address
        Object obj1 = new Object();
        Object obj2 = new Object();

        boolean result1 = (obj1 == obj2);
        boolean result2 = obj1.equals(obj2);

        System.out.println(result1);
        System.out.println(result2);
    }
}
