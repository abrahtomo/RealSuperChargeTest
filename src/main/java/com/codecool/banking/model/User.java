package com.codecool.banking.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int id;

    private String name;

    private BankAccount bankAccount;

    private List<String> history;

    private static List<User> userList = new ArrayList<User>();

    public User(int id, String name, BankAccount bankAccount) {
        this.id = id;
        this.name = name;
        this.bankAccount = bankAccount;
        userList.add(this);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BankAccount getBackAccount() {
        return bankAccount;
    }

    public List<String> getHistory() {
        return history;
    }

}
