package company.structural.bridge;

public abstract class CreditCard {
    protected iCreditCard tarjeta;

    public CreditCard(iCreditCard tarjeta) {
        this.tarjeta = tarjeta;
    }

    public abstract void realizarPago();
}
