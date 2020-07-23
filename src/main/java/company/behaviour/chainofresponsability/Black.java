package company.behaviour.chainofresponsability;

public class Black implements ApproveLoanChain{

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
        if(totalLoan >= 50000){
            System.out.println("esta solicitud la maneja la tarjeta Black, calificas para una oferta exclusiva!");
            System.out.println(filename);
        }else{
            next.creditCardRequest(totalLoan,filename);
        }
    }
}
