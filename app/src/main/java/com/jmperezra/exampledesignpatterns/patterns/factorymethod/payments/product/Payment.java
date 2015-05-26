package com.jmperezra.exampledesignpatterns.patterns.factorymethod.payments.product;

import com.jmperezra.exampledesignpatterns.patterns.factorymethod.commons.Login;
import com.jmperezra.exampledesignpatterns.patterns.factorymethod.commons.ShoppingList;

/**
 * Ejemplo patrón Factory Method.
 *
 * Product
 */
public interface Payment {

    public boolean isValidLogin(Login login);

    public void doPayment(ShoppingList shoppingList);

}
