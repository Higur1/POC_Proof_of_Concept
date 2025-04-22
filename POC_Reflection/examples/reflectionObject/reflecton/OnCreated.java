package reflectionObject.reflecton;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //need to be read by Reflection API
@Target(ElementType.METHOD) //annotation to be used in methods
public @interface OnCreated {

}
