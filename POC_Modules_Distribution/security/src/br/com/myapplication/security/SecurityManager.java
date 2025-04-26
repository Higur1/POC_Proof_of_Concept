package br.com.myapplication.security;

public interface SecurityManager {
    boolean authenticate(String username, String password);
}
