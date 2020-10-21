public class Service {
    // Apply default value for annotation
    @PrintAnnotation
    public void method1() {
        System.out.println("Run Method1");
    }

    // "*" is for value()
    // number will use it's default value
    @PrintAnnotation("*")
    public void method2() {
        System.out.println("Run Method2");
    }

    // When we use more than 1 parameter
    // We need to specify "value="
    @PrintAnnotation(value = "#", number = 20)
    public void method3() {
        System.out.println("Run Method3");
    }
}
