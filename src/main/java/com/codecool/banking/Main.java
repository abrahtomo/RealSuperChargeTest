package com.codecool.banking;

import com.codecool.banking.model.BankAccount;
import com.codecool.banking.model.User;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccountOfBob = new BankAccount(5000);
        User userOne = new User(1, "Bob", bankAccountOfBob);

        BankAccount bankAccountOfDonovan = new BankAccount(2000);
        User userTwo = new User(2, "Donovan", bankAccountOfDonovan);

        bankAccountOfBob.depositMoney(500);
        bankAccountOfBob.withDrawMoney(4000);
        bankAccountOfBob.transferMoney(2, 100);

        //userOne.getBackAccount().filterByWithdraw();
        //userTwo.getBackAccount().filterByDeposit();

        userOne.getBackAccount().filterByDate("2018-09-07");
    }
}
