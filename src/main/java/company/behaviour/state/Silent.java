package company.behaviour.state;

public class Silent implements MobileAlertState{
    @Override
    public void alert(MobileAlertStateContext context) {
        System.out.println("Telefono solo mostrando notificacion : Silenciado");
    }
}
