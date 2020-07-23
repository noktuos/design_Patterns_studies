package company.structural.bridge;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class UnSecuredCreditCard  implements iCreditCard{
    @Override
    public void realizarPago() {
        System.out.println("Pago realizado SIN seguridad");
    }
}
