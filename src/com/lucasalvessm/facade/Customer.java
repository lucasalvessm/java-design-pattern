package com.lucasalvessm.facade;

import java.math.BigDecimal;

public class Customer {

    public static void main(String args[]) {

        BankServiceFacade myBankService = new BankServiceFacade();

        int mySaving = myBankService.createNewAccount("saving", BigDecimal.valueOf(500.00));
        int myInvestment = myBankService
                .createNewAccount("investment", BigDecimal.valueOf(1000.00));

        myBankService.transferMoney(mySaving, myInvestment, BigDecimal.valueOf(300.00));
    }
}
