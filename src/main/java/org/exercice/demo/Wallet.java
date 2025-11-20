package org.exercice.demo;

import org.springframework.stereotype.Component;

@Component
public class Wallet {

    private double currentBalance = 0.0;
    private boolean isLostStatus = false;


    public void addVola(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        this.currentBalance += amount;
    }

    public double getVola() {
        return this.currentBalance;
    }

    public void open() {
        System.out.println("Wallet is now open.");
    }

    public void close() {
        System.out.println("Wallet is now closed.");
    }

    public boolean isLost() {
        return this.isLostStatus;
    }

    public void checkVola() {
        System.out.println("Current balance: " + this.currentBalance);
    }
}

