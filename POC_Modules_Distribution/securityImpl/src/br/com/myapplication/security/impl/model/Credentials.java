package br.com.myapplication.security.impl.model;

import java.util.List;

public class Credentials {
    private final List<Credential> credentials = List.of();

    public String getPasswordByUsername(String username) {
        return credentials
                .stream()
                .filter(c -> c.username().equals(username))
                .findFirst()
                .map(Credential::password)
                .orElse(null);
    }

    public List<Credential> getCredentials() {
        return credentials;
    }
}
