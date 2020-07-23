package company.structural.decorator;

public class SecureWrapper extends CreditWrapper{

    public SecureWrapper(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit() {
        decoratedCredit.showCredit();
        configSecure();

    }
    private void configSecure(){
        System.out.println("La configuracion de la tarjeta ha sido cambiada: Seguridad Maxima activada!");
    }
}
