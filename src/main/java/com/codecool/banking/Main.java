package com.codecool.banking;

import com.codecool.banking.model.BankAccount;
import com.codecool.banking.model.User;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccountOfPista = new BankAccount(5000);
        User userOne = new User(1, "pista", bankAccountOfPista);

        BankAccount bankAccountOfJózsi = new BankAccount(2000);
        User userTwo = new User(2, "józsi", bankAccountOfJózsi);

        bankAccountOfPista.depositMoney(500);
        bankAccountOfPista.withDrawMoney(4000);
        bankAccountOfPista.transferMoney(2, 100);

        userOne.getBackAccount().printHistory();
        userTwo.getBackAccount().printHistory();
    }
}
