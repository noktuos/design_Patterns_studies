package company.structural.flywheight;

public class Detective implements Enemy{

    private String weapon;
    private final String LIFE;

    public Detective() {
        this.LIFE = "1000";
    }


    @Override
    public void setWeapon(String weapon) {
        this.weapon=weapon;
        System.out.println("Su arma es: "+weapon);
    }

    @Override
    public void lifePoints() {
        System.out.println("la vida de un teniente es:"+ LIFE);
    }
}
