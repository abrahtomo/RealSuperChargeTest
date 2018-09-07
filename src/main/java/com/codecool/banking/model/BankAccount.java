package com.codecool.banking.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private int amountOfMoney;

    private List<String> history;

    public BankAccount(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
        this.history = new ArrayList<String>();
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public List<String> getHistory() {
        return history;
    }

    public void depositMoney(int moneyToDeposit){
        this.amountOfMoney += moneyToDeposit;
        history.add("Date: " + LocalDateTime.now() + ", Deposited: " + moneyToDeposit + ", Balance: " + amountOfMoney);
    }

    public void withDrawMoney(int moneyToWithdraw){
        this.amountOfMoney -= moneyToWithdraw;
        history.add("Date: " + LocalDateTime.now() + ", Withdrwan: " +moneyToWithdraw + ", Balance: " + amountOfMoney + "");
    }

    public void transferMoney(int userId, int amountOfMoneyToTransfer){
        for (User user: User.getUserList()){
            if (userId == user.getId()){
                user.getBackAccount().amountOfMoney += amountOfMoneyToTransfer;
                user.getBackAccount().history.add("Date: " + LocalDateTime.now() + ", Deposited: " + amountOfMoneyToTransfer + ", Balance: " + amountOfMoney);
            }
        }
        this.amountOfMoney -= amountOfMoneyToTransfer;
        history.add("Date: " + LocalDateTime.now() + ", Withdrwan: " +amountOfMoneyToTransfer + ", Balance: " + amountOfMoney + "");
    }

    public void printHistory(){
        for (String historyElements: history){
            System.out.println(historyElements);
        }
    }
}
