package br.com.myapplication.application;

import br.com.myapplication.security.SecurityManager;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        var manager = ServiceLoader.load(SecurityManager.class).findFirst().orElseThrow();
        var result =  manager.authenticate("A", "C");
        System.out.println(result);
    }
}
