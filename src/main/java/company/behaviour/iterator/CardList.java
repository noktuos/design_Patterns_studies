package company.behaviour.iterator;

public class CardList implements List{

    private Card[] tarjetas;

    public CardList(Card[] tarjetas) {
        this.tarjetas = tarjetas;
    }

    @Override
    public Iterator iterator() {
        return new CardIterator(tarjetas);
    }
}
