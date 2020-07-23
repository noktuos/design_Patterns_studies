package company.structural.facade;

public class Silver implements Credit{
    @Override
    public void showCredit() {
        System.out.println("La tarjeta silver tiene un credito de 1,900 USD");
    }
}
