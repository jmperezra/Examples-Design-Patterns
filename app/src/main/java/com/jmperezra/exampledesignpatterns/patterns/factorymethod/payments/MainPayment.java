package com.jmperezra.exampledesignpatterns.patterns.factorymethod.payments;

import com.jmperezra.exampledesignpatterns.patterns.factorymethod.commons.Login;
import com.jmperezra.exampledesignpatterns.patterns.factorymethod.commons.ShoppingList;
import com.jmperezra.exampledesignpatterns.patterns.factorymethod.payments.concretecreator.PaymentFactory;
import com.jmperezra.exampledesignpatterns.patterns.factorymethod.payments.product.Payment;

/**
 * Clase principal para realizar el pago.
 */
public class MainPayment {

    private Payment payment;

    /**
     * Se obtiene la forma de pago elegida por el usuario. En esta clase no importa que pago haya
     * elegido, para nosotros es una abstracción.
     *
     * @param typePayment
     */
    public MainPayment(PaymentFactory.TypePayment typePayment){
        this.payment = PaymentFactory.getPayment(typePayment);
    }


    public boolean isLogged(Login login){
        return (payment.isValidLogin(login));
    }

    /**
     * Método para realizar el pago de una lista de compra.
     *
     * @param shoppingList Lista de Compra
     *
     * Como podemos ver, podemos ampliar los tipos de pagos sin que el proceso se vea alterado.
     */
    public void payment(ShoppingList shoppingList){
        payment.doPayment(shoppingList);
    }

}
