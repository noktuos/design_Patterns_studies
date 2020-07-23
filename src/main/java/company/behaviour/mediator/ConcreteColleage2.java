package company.behaviour.mediator;

public class ConcreteColleage2 extends Colleage{
    public ConcreteColleage2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("user2 envio el sig mensaje "+ message);
        mediator.send(message,this);

    }

    @Override
    public void messageReceived(String message) {
        System.out.println("user2 recibio el sig mensaje : "+message);
    }
}
