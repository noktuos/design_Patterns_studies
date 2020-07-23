package company.creational.factory;



public class PaymentFactory {

    public static Payment buildPayment(PaymentType paymentType){
        switch (paymentType){
            case CREDITCARD:
                return new CreditCardPayment();
            case GOOGLEPAY:
                return new GooglePayment();
            default:
                return new CardPayment();
        }
    }
}
