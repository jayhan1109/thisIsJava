package apiClass.Classclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // Get Member class
        Class clazz = Class.forName("apiClass.Object.Member");

        // Constructor information
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor c : constructors) {
            System.out.println(c.getName());
            System.out.println(Arrays.toString(c.getParameterTypes()));
        }

        // Fields information
        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getType().getSimpleName());
        }

        // Method information
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
    }
}
