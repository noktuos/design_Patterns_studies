package company.behaviour.command;

import java.util.concurrent.ConcurrentMap;

public class CreditCardActivateCommand implements Command {

    CreditCard creditCard;
    public CreditCardActivateCommand(CreditCard creditCard){
        this.creditCard=creditCard;
    }

    @Override
    public void excecute() {
        creditCard.sendPinNumberToCustomer();
        creditCard.activate();
        creditCard.sendSMSToCustomerActivate();
    }
}
