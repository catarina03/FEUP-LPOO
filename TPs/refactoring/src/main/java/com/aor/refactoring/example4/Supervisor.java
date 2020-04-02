package com.aor.refactoring.example4;

import java.util.HashSet;
import java.util.Set;

public class Supervisor extends Person {
    private final String username;
    private final String password;
    Set<Worker> supervisee;
    
    public Supervisor(String name, String phone, String username, String password) {
        super(name, phone);
        this.username = username;
        this.password = password;
        supervisee = new HashSet<>();
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public void addSupervisee(Worker worker) {
        supervisee.add(worker);
    }

    public boolean isSupervisee(Worker worker) {
        return supervisee.contains(worker);
    }
}
