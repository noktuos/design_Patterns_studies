package company.creational.abstractFactory;

public class Paypal implements PaymentMethod{
    @Override
    public String doPayment() {
        return "Pago mediante paypal";
    }
}
