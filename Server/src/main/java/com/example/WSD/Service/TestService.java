package com.example.WSD.Service;

import org.springframework.stereotype.Component;

import javax.transaction.TransactionManager;

public class TestService {
    TransactionManager transactionManager;

    public TestService() {
    }

    public TransactionManager getTransactionManager() {
        return transactionManager;
    }

    public void setTransactionManager(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    public void doSomething(){
        int i=1;
        int l=2;
        int l2=3;
    }
}
