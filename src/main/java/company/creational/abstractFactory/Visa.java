package company.creational.abstractFactory;

public class Visa implements Card {
    @Override
    public String getCardType() {
        return "VISA";
    }

    @Override
    public String getCardNumber() {
        return "XXX-XXX-XXX-XXX";
    }
}
