package company.creational.prototype;

import java.util.HashMap;
import java.util.Map;

import static company.creational.prototype.PrototypeFactory.CardType.AMEX;
import static company.creational.prototype.PrototypeFactory.CardType.VISA;

public class PrototypeFactory {

    public static class CardType{
        public static final String VISA = "visa";
        public static final String AMEX = "amex";

    }
    private static Map<String, PrototypeCard> prototypes = new HashMap<>();

    public static PrototypeCard getInstance(final String tipo) throws CloneNotSupportedException{
        return prototypes.get(tipo).clone();
    }
    public static void  loadCard(){
        Visa visa = new Visa();
        visa.setName("Esta tarjeta es Visa con el numero 0000");
        prototypes.put(VISA,visa);

        Amex amex = new Amex();
        amex.setName("Esta tarjeta es Amex con el numero 1111");
        prototypes.put(AMEX,amex);
    }
}
