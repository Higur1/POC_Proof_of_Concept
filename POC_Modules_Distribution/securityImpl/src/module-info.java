import br.com.myapplication.security.SecurityManager;
import br.com.myapplication.security.impl.SecurityManagerImpl;

//open all packages to reflection
//open module securityImpl{}

module securityImpl {
    requires security;
    requires com.google.gson;
    requires java.logging;
    provides SecurityManager with SecurityManagerImpl;
    opens br.com.myapplication.security.impl.model;
}