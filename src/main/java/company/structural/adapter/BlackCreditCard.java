package company.structural.adapter;

public class BlackCreditCard implements Secure{
    @Override
    public void payWithSecureLevelA() {
        System.out.println("Se realizo el pago con tarjeta BLACK: Seguridad alta nivel A");
    }

    @Override
    public void payWithSecureLevelZ() {

    }
}
