package com.projects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Application context from config class
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);

        // We can instantiate beans from the context
        ShoppingCart cart = context.getBean(ShoppingCart.class);

        cart.checkout("CANCELLED");
    }
}