package company.behaviour.chainofresponsability;

public class Gold implements ApproveLoanChain {

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
        if(totalLoan<10000){
            System.out.println("Esta solicitud la maneja la tarjeta Gold, Calificas!");
            System.out.println(filename);
        }else{
            next.creditCardRequest(totalLoan,filename);
        }
    }
}
