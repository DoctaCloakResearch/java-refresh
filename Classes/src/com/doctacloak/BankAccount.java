package com.doctacloak;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String holderName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(
            "56789",
            1_000,
            "Default name",
            "Default email address",
            "default phone"
        );
    }

    public BankAccount(String accountNumber, double balance, String holderName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.holderName = holderName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderName() {
        return this.holderName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(double amount) {
        this.setBalance(this.balance + amount);
    }

    public double withdrawFunds(double amount) {
        double amountReturned = 0;
        if (this.balance - amount >= 0) {
            this.setBalance(this.balance - amount);
            amountReturned = amount;
        } else {
            System.out.println("Insufficient funds.");
            System.out.println("You only have $" + this.getBalance() + " in your bank account.");
        }
        return amountReturned;
    }

}
