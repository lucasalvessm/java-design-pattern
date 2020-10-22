package com.lucasalvessm.facade;

import java.math.BigDecimal;
import java.util.Hashtable;

public class BankServiceFacade {
    private Hashtable<Integer, Account> bankAccounts;

    public BankServiceFacade() {
        this.bankAccounts = new Hashtable<>();
    }

    public Integer createNewAccount(String accountType, BigDecimal initAmount) {
        Account newAccount = null;
        switch (accountType) {
            case "chequing":
                newAccount = new Chequing(initAmount);
                break;
            case "saving":
                newAccount = new Saving(initAmount);
                break;
            case "investment":
                newAccount = new Investment(initAmount);
                break;
            default:
                System.out.println("Invalid account type");
                break;
        }
        if (newAccount != null) {
            this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }
        return -1;
    }

    public void transferMoney(int to, int from, BigDecimal amount) {
        Account toAccount = this.bankAccounts.get(to);
        Account fromAccount = this.bankAccounts.get(from);

        fromAccount.transfer(toAccount, amount);
    }

}
