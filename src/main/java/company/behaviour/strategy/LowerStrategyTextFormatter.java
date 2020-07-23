package company.behaviour.strategy;

public class LowerStrategyTextFormatter implements StrategyTextFormatter{
    @Override
    public void format(String text) {
        System.out.println("texto en minusculas "+text.toLowerCase());
    }
}
