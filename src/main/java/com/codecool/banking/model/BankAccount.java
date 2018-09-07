package com.codecool.banking.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private int balance;

    private List<String> history;

    public BankAccount(int amountOfMoney) {
        this.balance = amountOfMoney;
        this.history = new ArrayList<String>();
    }

    public int getBalance() {
        return balance;
    }

    public List<String> getHistory() {
        return history;
    }

    public void depositMoney(int moneyToDeposit){
        this.balance += moneyToDeposit;
        history.add("Date: " + LocalDateTime.now() + ", Deposited: " + moneyToDeposit + ", Balance: " + balance);
    }

    public void withDrawMoney(int moneyToWithdraw){
        this.balance -= moneyToWithdraw;
        history.add("Date: " + LocalDateTime.now() + ", Withdrwan: " +moneyToWithdraw + ", Balance: " + balance + "");
    }

    public void transferMoney(int userId, int amountOfMoneyToTransfer){
        for (User user: User.getUserList()){
            if (userId == user.getId()){
                user.getBackAccount().depositMoney(amountOfMoneyToTransfer);
            }
        }
        this.balance -= amountOfMoneyToTransfer;
        history.add("Date: " + LocalDateTime.now() + ", Withdrwan: " +amountOfMoneyToTransfer + ", Balance: " + balance + "");
    }

    public void printHistory(){
        for (String historyElements: history){
            System.out.println(historyElements);
        }
    }
}
