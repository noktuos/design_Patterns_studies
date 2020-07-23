package company.behaviour.mediator;

public class ConcreteMediator implements Mediator {

    private ConcreteColleage1 user1;
    private ConcreteColleage2 user2;


    public void setUser1(ConcreteColleage1 colleage1) {
        this.user1 =colleage1;
    }

    public void setUser2(ConcreteColleage2 colleage2) {
        this.user2 = colleage2;
    }
    @Override
    public void send(String message, Colleage colleaje) {
        if(colleaje==user1){
            user2.messageReceived(message);
        }else{
            user1.messageReceived(message);
        }

    }
}
