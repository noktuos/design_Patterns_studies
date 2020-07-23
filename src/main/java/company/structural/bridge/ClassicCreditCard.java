package company.structural.bridge;

public class ClassicCreditCard extends CreditCard{

    public ClassicCreditCard(iCreditCard tarjeta){
        super(tarjeta);
    }

    @Override
    public void realizarPago() {
        tarjeta.realizarPago();
    }
}
