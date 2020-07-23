package company.structural.decorator;

public class CreditWrapper implements Credit{
    protected Credit decoratedCredit;

    public CreditWrapper(Credit decoratedCredit) {
        this.decoratedCredit = decoratedCredit;
    }

    @Override
    public void showCredit() {
        decoratedCredit.showCredit();
    }
}
