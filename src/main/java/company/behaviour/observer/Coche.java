package company.behaviour.observer;

public class Coche implements Observer{
    @Override
    public void update(Semaforo semaforo) {
        if(semaforo.status.equals("ROJO_COCHE")){
            System.out.println("El coche NO puede pasar");
        }else{
            System.out.println("El coche SI puede pasar");
        }
    }
}
