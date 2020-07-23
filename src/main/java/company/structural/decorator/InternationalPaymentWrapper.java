package company.structural.decorator;

public class InternationalPaymentWrapper extends CreditWrapper{

    public InternationalPaymentWrapper(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit() {
        decoratedCredit.showCredit();
        configInternationalPayment();
    }
    private void configInternationalPayment(){
        System.out.println("la tarjeta ha sido configurada para pagos internacionales");
    }
}
