package company.behaviour.templateMethod;

public class ClassicCreditCardVisitor implements CreditCardVisitor {
    @Override
    public void ofertaVuelos(OfertaVuelos ofertaVuelos) {
        System.out.println("Descuento de 3% en vuelos con tu tarjeta clasica");
    }

    @Override
    public void ofertaGasolina(OfertaGasolina ofertaGasolina) {
        System.out.println("descuento de 5% en gasolina con tu tarjeta clasica");
    }
}
