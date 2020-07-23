package company.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject{

    public List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        observerList.add(o);
    }

    @Override
    public void dettach(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyUpdate(Semaforo semaforo) {
        for(Observer o: observerList){
            o.update(semaforo);
        }
    }
}
