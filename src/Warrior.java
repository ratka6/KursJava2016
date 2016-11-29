/**
 * Created by krzysiek on 21.11.2016.
 */
public class Warrior extends Character implements Chant {

    private String weapon;

    public Warrior(String name, double hp, double mp, String weapon) {
        super(name, hp, mp);
        this.weapon = weapon;
    }

    @Override
    public void attack() {
        System.out.println(this + " attacks with " + weapon + "!");
    }

    @Override
    public void move() {
        System.out.println(this + " moves!");
    }

    public void showWeapon() {
        System.out.println(name + " draws " + weapon);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void chant() {
        System.out.println("CHARGE!!!");
    }
}
