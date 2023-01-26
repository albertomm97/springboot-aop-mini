package com.projects;

import org.springframework.stereotype.Component;

// Bean annotation based creation
@Component
public class ShoppingCart {

    // Before checkout exection i want to execute all the aspects
    public void checkout(String status) {
        // Loggin aspect
        // Authentication/ Authorization aspect
        // Sanitize data aspect

        // Actual method functionality
        System.out.println("Checkout mehtod from Shopping Cart Called");
    }

    public int quantity() {
        return 2;
    }
}
