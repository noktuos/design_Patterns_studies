package company.behaviour.templateMethod;

import company.behaviour.templateMethod.OfertaGasolina;
import company.behaviour.templateMethod.OfertaVuelos;

public interface CreditCardVisitor {


    void ofertaVuelos(OfertaVuelos ofertaVuelos);
    void ofertaGasolina(OfertaGasolina ofertaGasolina);

}
