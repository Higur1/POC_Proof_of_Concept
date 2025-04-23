package CustomAnnotationSecurityConfig;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) //only classes, interfaces, record (Top level declaration)
public @interface SecurityConfig {
    Group[] allowed();
}
