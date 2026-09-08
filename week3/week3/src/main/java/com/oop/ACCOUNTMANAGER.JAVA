public class AccountManager { 
    public static void main(String[] args) { 
        BankAccount acc1 = new BankAccount(); 
        acc1.balance = 500; 
        
        // FIX: Create a "new" object so they have separate memory on the heap
        BankAccount acc2 = new BankAccount(); 
        acc2.balance = 750; 
        
        BankAccount acc3 = findAccount("missing-id"); 
        
        System.out.println("acc1 balance: " + acc1.balance); 

        // FIX: Professional null check to handle missing data
        if (acc3 != null) {
            System.out.println("acc3 balance: " + acc3.balance); 
        } else {
            System.out.println("Account not found");
        }
    } 

    public static BankAccount findAccount(String id) { 
        return null; 
    } 
}