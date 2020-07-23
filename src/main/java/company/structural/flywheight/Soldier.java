package company.structural.flywheight;

public class Soldier implements Enemy {

    private String weapon;
    private final String LIFE;

    public Soldier() {

        LIFE = "200";
    }

    @Override
    public void setWeapon(String weapon) {
        this.weapon=weapon;
        System.out.println("Su arma es: "+weapon);
    }

    @Override
    public void lifePoints() {
        System.out.println("la vida de un soldado son: "+ LIFE);
    }
}
