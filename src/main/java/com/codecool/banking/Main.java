package com.codecool.banking;

import com.codecool.banking.model.BankAccount;
import com.codecool.banking.model.User;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccountOfPista = new BankAccount(5000);
        User userOne = new User(1, "pista", bankAccountOfPista);

        bankAccountOfPista.depositMoney(500);
        bankAccountOfPista.withDrawMoney(4000);

        userOne.getBackAccount().printHistory();

    }
}
