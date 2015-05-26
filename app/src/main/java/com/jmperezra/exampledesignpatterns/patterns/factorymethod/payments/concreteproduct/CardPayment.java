package com.jmperezra.exampledesignpatterns.patterns.factorymethod.payments.concreteproduct;

import com.jmperezra.exampledesignpatterns.patterns.factorymethod.commons.Login;
import com.jmperezra.exampledesignpatterns.patterns.factorymethod.commons.ShoppingList;
import com.jmperezra.exampledesignpatterns.patterns.factorymethod.payments.product.Payment;

/**
 * Ejemplo patrón Factory Method.
 *
 * ConcreteProduct
 */
public class CardPayment implements Payment {

    @Override
    public boolean isValidLogin(Login login) {
        //todo implementar la lógica del login para la tarjeta.
        return true; //valor para el ejemplo.
    }

    @Override
    public void doPayment(ShoppingList shoppingList) {
        //todo se implementa el método/para llevar acabo el pago con el TPV elegido.
        //...
    }
}
