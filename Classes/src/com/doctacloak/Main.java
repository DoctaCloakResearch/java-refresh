package com.doctacloak;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        porsche.setModel("porsche son");

        BankAccount myAccount = new BankAccount();
        myAccount.withdrawFunds(500);
        System.out.println(myAccount.getBalance());
    }
}
