package company.structural.adapter;

public class GoldCreditCard implements Secure {
    @Override
    public void payWithSecureLevelA() {

    }

    @Override
    public void payWithSecureLevelZ() {
        System.out.println("Se realizo el pago con tarjeta GOLD: Seguridad baja nivel Z");
    }
}
