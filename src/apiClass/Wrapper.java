package apiClass;

public class Wrapper {
    public static void main(String[] args) {
        // Boxing
        Integer obj1 = new Integer(100);
        // Auto Boxing
        Integer obj2 = 100;

        // Unboxing
        int val1 = obj1.intValue();
        // Auto Unboxing
        int val2 = obj2;

        // String to int
        int val3 = Integer.parseInt("100");

        // == and !=
        // == with Wrapper class will compare the address
        // So, this is false
        System.out.println(obj1 == obj2);
        // Use equals() to compare the value
        // Or Unboxing
        System.out.println(obj1.equals(obj2));
    }
}
