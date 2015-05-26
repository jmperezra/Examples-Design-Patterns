package com.jmperezra.exampledesignpatterns.patterns.factorymethod.payments.concreteproduct;

import com.jmperezra.exampledesignpatterns.patterns.factorymethod.commons.Login;
import com.jmperezra.exampledesignpatterns.patterns.factorymethod.commons.ShoppingList;
import com.jmperezra.exampledesignpatterns.patterns.factorymethod.payments.product.Payment;

/**
 * Ejemplo patrón Factory Method.
 *
 * ConcreteProduct
 */
public class PaypalPayment implements Payment {

    @Override
    public boolean isValidLogin(Login login) {
        //todo implementar la lógica del login para PayPal
        return true; //valor para el ejemplo.
    }

    @Override
    public void doPayment(ShoppingList shoppingList) {
        //todo hacer la implementación de la API de Paypal
    }
}
