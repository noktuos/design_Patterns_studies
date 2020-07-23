package company.behaviour.strategy;

public class UpperStrategyTextFormatter implements StrategyTextFormatter {

    @Override
    public void format(String text) {
        System.out.println("texto en mayusculas "+text.toUpperCase());
    }
}
