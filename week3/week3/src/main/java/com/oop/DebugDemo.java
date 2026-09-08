package com.oop;

public class DebugDemo {
    
    public static void main(String[] args) {
        int balance = 1000;
        int copy = balance;
        int amount = reduceBalance(copy);
        System.out.println("Balance: " + balance);
        System.out.println("Amount: " + amount);  
    }

    public static int reduceBalance(int balance) {
        balance = balance - 500;
        return balance;
    }
}
