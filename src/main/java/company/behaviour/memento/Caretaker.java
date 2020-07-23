package company.behaviour.memento;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private List<ArticleMemento> estados= new ArrayList<>();
    public void addMemento(ArticleMemento memento){
        estados.add(memento);
    }
    public ArticleMemento getMemento(int index){
        return estados.get(index);
    }

}
