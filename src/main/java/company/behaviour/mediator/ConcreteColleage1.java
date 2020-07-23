package company.behaviour.mediator;

public class ConcreteColleage1 extends Colleage{

    public ConcreteColleage1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("user1 envio el sig mensaje "+ message);
        mediator.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("user1 recibio el siguiente mensaje : "+message);
    }
}
