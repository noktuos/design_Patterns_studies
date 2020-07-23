package company.structural.bridge;

public class SecureCreditCard implements iCreditCard
{
    @Override
    public void realizarPago() {
        System.out.println("Pago realizado CON seguridad");
    }
}
