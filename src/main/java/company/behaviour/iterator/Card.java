package company.behaviour.iterator;

public class Card {

    private String type;
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Card(String type, String number) {
        this.type = type;
        this.number=number;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;

    }
}
