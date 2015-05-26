package com.jmperezra.exampledesignpatterns.patterns.factorymethod.payments.concretecreator;

import com.jmperezra.exampledesignpatterns.patterns.factorymethod.payments.concreteproduct.CardPayment;
import com.jmperezra.exampledesignpatterns.patterns.factorymethod.payments.concreteproduct.PaypalPayment;
import com.jmperezra.exampledesignpatterns.patterns.factorymethod.payments.concreteproduct.WireTransferPayment;
import com.jmperezra.exampledesignpatterns.patterns.factorymethod.payments.product.Payment;

/**
 * Ejemplo patrón Factory Method.
 *
 * Creator - ConcreteCreator
 */
public class PaymentFactory {

    public enum TypePayment { CARD, PAYPAL, WIRE_TRANSFER }

    public static Payment getPayment(TypePayment typePayment){
        switch (typePayment){
            case CARD:
                return new CardPayment();
            case PAYPAL:
                return new PaypalPayment();
            case WIRE_TRANSFER:
                return new WireTransferPayment();
            default:
                //Para hacerlo más entendible por defecto devolvemos tarjeta.
                return new CardPayment();
        }
    }

}
