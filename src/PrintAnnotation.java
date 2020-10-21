import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Only method can be applied
@Target({ElementType.METHOD})
// Retention - we set RUNTIME to use Reflection
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {

    // value() is special => Default Value of annotation
    // Doesn't have to add name when we use it
    String value() default "-";
    int number() default 15;
}
