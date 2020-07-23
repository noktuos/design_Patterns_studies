package company.creational.prototype;

public interface PrototypeCard extends Cloneable{

    void getCard();

    PrototypeCard clone() throws CloneNotSupportedException;

}
