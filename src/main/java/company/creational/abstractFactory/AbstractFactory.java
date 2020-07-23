package company.creational.abstractFactory;

public interface AbstractFactory <T>{
    T create(String type);
}
