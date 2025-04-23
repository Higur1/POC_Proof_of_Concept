import java.lang.annotation.Retention;

/*@Retention(RetentionPolicy.CLASS) // the information is stored at runtime in the bytecode file but not available in runtime*/
/*@Retention(RetentionPolicy.SOURCE) // the compiler will not store the information about the use of annotation defined with Source - Useful for development annotation*/
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME) // stores information about the use of annotation and this information is available at runtime - useful for using reflection to investigate the elements of the class
public @interface RetentionPolicyInformation {}
