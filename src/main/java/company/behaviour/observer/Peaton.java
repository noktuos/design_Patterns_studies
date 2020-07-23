package company.behaviour.observer;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Peaton implements Observer{
    @Override
    public void update(Semaforo semaforo) {
        if(semaforo.status.equals("ROJO_COCHE")){
            System.out.println("El semaforo para peaton esta en VERDE");
        }else{
            System.out.println("Semaforo ROJO para peaton");
        }
    }
}
