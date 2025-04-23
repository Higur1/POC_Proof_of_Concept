import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.FIELD,ElementType.METHOD})
@Documented
public @interface Id {}
