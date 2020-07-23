package company.behaviour.templateMethod;

public class OfertaGasolina implements OfertaElement{
    @Override
    public void accept(CreditCardVisitor visitor) {
        visitor.ofertaGasolina(this);
    }
}
