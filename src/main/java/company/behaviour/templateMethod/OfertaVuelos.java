package company.behaviour.templateMethod;

public class OfertaVuelos implements OfertaElement
{
    @Override
    public void accept(CreditCardVisitor visitor) {
        visitor.ofertaVuelos(this);
    }
}
