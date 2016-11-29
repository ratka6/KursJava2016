/**
 * Created by krzysiek on 21.11.2016.
 */
public class Wizard extends Character implements Chant {
    private String spell;

    public Wizard(String name, double hp, double mp, String spell) {
        super(name, hp, mp);
        this.spell = spell;
    }


    @Override
    public void attack() {
        System.out.println(this + " casts " + spell + "!");
    }

    public void presentSpell() {
        System.out.println(name + " shows " + spell);
    }

    @Override
    public void move() {
        System.out.println(this + " moves!");
    }

    @Override
    public void chant() {
        System.out.println("Not enough mana!");
    }
}
