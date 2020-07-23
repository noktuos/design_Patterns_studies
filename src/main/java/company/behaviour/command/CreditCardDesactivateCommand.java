package company.behaviour.command;

import company.creational.abstractFactory.Credit;

public class CreditCardDesactivateCommand implements Command {

    CreditCard creditCard ;
    public CreditCardDesactivateCommand(CreditCard creditCard){
        this.creditCard=creditCard;
    }

    @Override
    public void excecute() {
        creditCard.desactivate();
        creditCard.sendSMSCustomerDesactivate();
    }
}
