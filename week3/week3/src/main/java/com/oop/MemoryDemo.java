package com.oop;

public class MemoryDemo {
    public static void main(String[] args) {
         // --- Part 1: Primitives ---
         int balance = 1000;
         int copy = balance; 
    
         copy = 500;

         System.out.println("Balance: " + balance);
         System.out.println("Copy: " + copy);
         
         // --- Part 2: References ---
         BankAccount acc1 = new BankAccount();
         acc1.balance = 1000;

         BankAccount acc2 = acc1;
         acc2.balance = 500;

         System.out.println("acc1: " + acc1.balance);
         System.out.println("acc2: " + acc2.balance);

         // --- Part 3: Method Behavior ---
        BankAccount myAccount = new BankAccount();
        myAccount.balance = 500;
        applyBonusToAccount(myAccount);
        System.out.println("myAccount: " + myAccount.balance); // Prints 600

        int cash = 500;
        applyBonusToAmount(cash);
        System.out.println("cash: " + cash); // Prints 500 (Unchanged!)

      
    }   

        public static void applyBonusToAccount(BankAccount acc) {
        acc.balance = acc.balance + 100;
       }

       public static void applyBonusToAmount(int amount) {
        amount = amount + 100;
       }    
}
