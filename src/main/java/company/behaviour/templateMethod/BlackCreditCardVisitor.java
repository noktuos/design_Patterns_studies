package company.behaviour.templateMethod;

public class BlackCreditCardVisitor implements CreditCardVisitor {
    @Override
    public void ofertaVuelos(OfertaVuelos ofertaVuelos) {
        System.out.println("Oferta del 5% en vuelos por usar tu tarjeta black");
    }

    @Override
    public void ofertaGasolina(OfertaGasolina ofertaGasolina) {
        System.out.println("Oferta de 10% en gasolina al usar tu tarjeta black");
    }
}
