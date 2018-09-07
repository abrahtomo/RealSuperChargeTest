package com.codecool.banking.model;

public class BankAccount {

    private int amountOfMoney;

    public BankAccount(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void depositMoney(int moneyToDeposit){
        this.amountOfMoney += moneyToDeposit;
    }

    public void withDrawMoney(int moenyToWithdraw){
        this.amountOfMoney -= moenyToWithdraw;
    }
}
