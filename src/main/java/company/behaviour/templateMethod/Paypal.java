package company.behaviour.templateMethod;

public class Paypal extends Payment{

    @Override
    void initialize() {
        System.out.println("iniciando el pago con PAYPAL");
    }

    @Override
    void startPayment() {
        System.out.println("inicio de el pago con PAYPAL");
    }

    @Override
    void endPayment() {
        System.out.println("pago finalizado, gracias por su preferencia a PAYPAL");
    }
}
