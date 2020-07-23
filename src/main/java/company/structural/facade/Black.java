package company.structural.facade;

public class Black implements Credit{
    @Override
    public void showCredit() {
        System.out.println("El credito de la tarjeta black es 1,000,000");
    }
}
