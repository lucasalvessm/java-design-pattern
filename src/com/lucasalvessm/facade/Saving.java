package com.lucasalvessm.facade;

import java.math.BigDecimal;

public class Saving implements Account {

    private BigDecimal amount;

    public Saving(BigDecimal initAmount) {
        this.amount = initAmount;
    }

    @Override
    public void deposit(BigDecimal amount) {

    }

    @Override
    public void withdraw(BigDecimal amount) {

    }

    @Override
    public void transfer(Account toAccount, BigDecimal amount) {

    }

    @Override
    public int getAccountNumber() {
        return 0;
    }
}
