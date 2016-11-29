/**
 * Created by krzysiek on 21.11.2016.
 */
public class Character {
    String name;
    private double hp;
    private double mp;

    public Character(String name, double hp, double mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", mp=" + mp +
                '}';
    }

    public void attack() {
        System.out.println(this + " attacks!");
    }

    public void move() {
        System.out.println(this + " moves!");
    }
}
