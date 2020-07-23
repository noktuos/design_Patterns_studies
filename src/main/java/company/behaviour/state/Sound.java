package company.behaviour.state;

public class Sound implements MobileAlertState {
    @Override
    public void alert(MobileAlertStateContext context) {
        System.out.println("*Sonando contesta lamada*");
    }
}
