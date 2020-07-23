package company.behaviour.command;

public class
CreditCard {
    public void sendPinNumberToCustomer() {
        System.out.println("el pin ha sido enviado al cliente");
    }
    public void sendSMSToCustomerActivate() {
        System.out.println("SMS Sent to customer tarjeta activada");
    }
    public void activate() {
        System.out.println("Su tarjeta ha sido activada con exito");
    }
    public void desactivate() {
        System.out.println("Su tarjeta ha sido desactivada");
    }
    public void sendSMSCustomerDesactivate() {
        System.out.println("Hola este es un SMS para notificarle que su tarjeta ha sido desactivada, si desconoce esta operacion favor de comunicarse a 111-222-333");
    }
}