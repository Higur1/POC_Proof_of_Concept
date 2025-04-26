package br.com.myapplication.security.impl;

import br.com.myapplication.security.SecurityManager;
import br.com.myapplication.security.impl.model.Credentials;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import static java.util.Objects.requireNonNull;

public class SecurityManagerImpl implements SecurityManager {
    private static final Logger logger = Logger.getLogger(SecurityManagerImpl.class.getName());

    static{
        try {
            LogManager.getLogManager().readConfiguration(SecurityManagerImpl.class.getResourceAsStream("/logging.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean authenticate(String username, String password) {
        //return Objects.equals(username, "A") && Objects.equals(password, "B");
        logger.info("Trying to authenticate user: " + username);
        String storedPassword = getCredentials().getPasswordByUsername(username);
        return storedPassword != null && storedPassword.equals(password);
    }

    private Credentials getCredentials() {
        try (Reader reader = new InputStreamReader(requireNonNull(getClass().getResourceAsStream("/credentials.json")))) {
            return new Gson().fromJson(reader, Credentials.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
