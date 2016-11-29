/**
 * Created by krzysiek on 21.11.2016.
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("Klasa/Obiekt");

        Character character = new Character("Janusz", 100, 100);

        character.move();
        character.attack();
        System.out.println("***");

        System.out.println("\nDziedziczenie");
        Warrior warrior = new Warrior("Warrior", 100, 100, "Axe");
        warrior.showWeapon();
        warrior.attack();
        warrior.move();
        System.out.println();

        Wizard wizard = new Wizard("Wizard", 100, 100, "Fireball");

        wizard.presentSpell();
        wizard.attack();
        wizard.move();

        System.out.println("***");
        System.out.println("\nPolimorfizm");

        Character secondWarrior = new Warrior("Second Warrior", 100, 100, "Sword");
        Character secondWizard = new Wizard("Second Wizard", 100, 100, "Frost Nova");

        secondWarrior.attack();
        secondWizard.attack();

        if (secondWarrior instanceof Warrior) {
            ((Warrior) secondWarrior).showWeapon();
        }

        if (secondWarrior instanceof Wizard) {
            ((Wizard) secondWarrior).presentSpell();
        }
        else {
            System.out.println("not instance of");
        }
        System.out.println("***");

        System.out.println("\nInterfejs");

        Wizard thirdWizard = new Wizard("Third Wizard", 100, 200, "Ice bolt");
        thirdWizard.chant();

        Chant war = new Warrior("Third Warrior", 100, 100, "Sword");
        war.chant();
    }
}
