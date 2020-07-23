package company.behaviour.iterator;

public class CardIterator implements Iterator{

    private Card[] tarjetas;
    private int position;

    public CardIterator(Card[] tarjetas){
        this.tarjetas = tarjetas;
        position=0;
    }

    @Override
    public boolean hasNext() {
        if(position>=tarjetas.length){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return tarjetas[position++];
    }

    @Override
    public Object currentItem() {
        return tarjetas[position];
    }
}
