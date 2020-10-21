package exception;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("java.lang.String2");
        } catch (ClassNotFoundException e) {
            System.out.println("Class is not found!");
        }finally {
            System.out.println("Good Bye");
        }
    }
}