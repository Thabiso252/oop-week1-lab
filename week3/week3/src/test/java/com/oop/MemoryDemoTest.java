package com.oop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MemoryDemoTest {

    @Test 
    void separateObjectsDoNotShareState() { 
        // Arrange: Setup two distinct objects
        BankAccount acc1 = new BankAccount(); 
        BankAccount acc2 = new BankAccount(); 
        
        // Act: Change only the first one
        acc1.balance = 500; 
        
        // Assert: Verify the second one is still 0
        assertEquals(0, acc2.balance); 
    } 

    @Test 
    void aliasedObjectsShareState() { 
        // Arrange: Make two variables point to the same object
        BankAccount acc1 = new BankAccount(); 
        acc1.balance = 500; 
        BankAccount acc2 = acc1; 
        
        // Act: Change the object via the second variable
        acc2.balance = 750; 
        
        // Assert: Verify the first variable sees the change
        assertEquals(750, acc1.balance); 
    } 
}
