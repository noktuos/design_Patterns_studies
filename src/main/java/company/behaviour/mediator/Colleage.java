package company.behaviour.mediator;

import javax.print.attribute.standard.Media;

public abstract class Colleage {
    protected Mediator mediator;
    public Colleage(Mediator mediator){
        this.mediator=mediator;
    }
    public abstract void send(String message);
    public abstract void messageReceived(String message);
}
