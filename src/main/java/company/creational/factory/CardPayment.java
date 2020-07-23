package company.creational.factory;

public class CardPayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Pagando con Tarjeta de Credito");
        System.out.println("No. de transaccion : 12511");
        System.out.println("No. tarjeta : 1231-5234-7777-1241");
        System.out.println("Direccion : Colegio de cholula 1800");
    }
}
