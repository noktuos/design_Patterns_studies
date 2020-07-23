package company.behaviour.chainofresponsability;

public class Tarjeta implements ApproveLoanChain{

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
    public void creditCardRequest(int totalLoan,String filename) {
        Gold gold = new Gold();
        this.setNext(gold);
        Platinum platinum = new Platinum();
        gold.setNext(platinum);
        Black black = new Black();
        platinum.setNext(black);
        next.creditCardRequest(totalLoan,filename);
    }
}
