import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD}) //defining that this id can only be applied to attributes and methods
public @interface TargetInformation {
}
