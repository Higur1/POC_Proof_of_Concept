package CustomAnnotationSecurityConfig;

@SecurityConfig(allowed = {
        @Group("admin"),
        @Group("guest")
})
public class ExSecurityConfig {

}
