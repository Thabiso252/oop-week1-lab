package com.oop;


public class Main {
    public static void main(String[] args) {
        BankAccount jacobsAccount = new BankAccount();
        BankAccount yusAccount = new BankAccount();
        jacobsAccount.balance = 100;

        System.out.println("Before deposit: " + jacobsAccount.balance);
        jacobsAccount.deposit(100);
        System.out.println("After deposit: " + jacobsAccount.balance);
        System.out.println(yusAccount.balance);



    }
}