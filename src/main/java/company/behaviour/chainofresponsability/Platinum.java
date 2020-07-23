package company.behaviour.chainofresponsability;

public class Platinum implements ApproveLoanChain{

    private ApproveLoanChain next;

    @Override
    public void setNext(ApproveLoanChain loan) {
        next=loan;
    }

    @Override
    public ApproveLoanChain getNext() {
        return next;
    }

    @Override
    public void creditCardRequest(int totalLoan, String filename) {
        if(totalLoan> 10000 && totalLoan <= 50000){
            System.out.println("Esta solicitud la toma la tarjeta platinum, Califica!");
            System.out.println(filename);
        }else{
            next.creditCardRequest(totalLoan, filename);
        }
    }
}
