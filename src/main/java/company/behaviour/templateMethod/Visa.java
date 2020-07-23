package company.behaviour.templateMethod;

public class Visa  extends Payment{
    @Override
    void initialize() {
        System.out.println("inicializado pago por VISA");
    }

    @Override
    void startPayment() {
        System.out.println("inicio de pago con VISA");
    }

    @Override
    void endPayment() {
        System.out.println("pago realizado con VISA");
    }
}
