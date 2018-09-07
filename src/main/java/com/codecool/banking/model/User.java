package com.codecool.banking.model;

import java.util.List;

public class User {

    private int id;

    private String name;

    private int amountOfMoney;

    private List<String> history;

    public User(int id, String name, int amountOfMoney) {
        this.id = id;
        this.name = name;
        this.amountOfMoney = amountOfMoney;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public List<String> getHistory() {
        return history;
    }


}
