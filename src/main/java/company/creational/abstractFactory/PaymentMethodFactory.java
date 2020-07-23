package company.creational.abstractFactory;

public class PaymentMethodFactory implements AbstractFactory<PaymentMethod> {

    @Override
    public PaymentMethod create(String type) {
        if("CREDIT".equals(type)){
            return new Credit();
        }else if ("DEBIT".equals(type)){
            return new Debit();
        }else if ("PAYPAL".equals(type)){
            return new Paypal();
        }
        return null;
    }
}
