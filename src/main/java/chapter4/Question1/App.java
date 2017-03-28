package chapter4.Question1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Character character = new Character();
        System.out.println("Health: " + (character.getHealth() + character.getExtraHealth()));
        System.out.println("Atack: " + character.getAttack());
        System.out.println("Enhanced Attack(Fire): " + character.getAttack() + character.getBurn());
        System.out.println("Defence: " + character.getDefence());
        System.out.println("Mana: " + character.getMana());

    }


}

class Character extends Mage implements FireType
{
    private int health;
    private int attack;
    private int defence;

    public Character()
    {
        health = 100;
        attack = 50;
        defence = 50;
    }

    public Character(int health, int attack, int defence)
    {
        this.health = health;
        this.attack = attack;
        this.defence = defence;
    }

    public int getHealth()
    {
        return health;
    }

    public int getAttack()
    {
        return attack;
    }

    public int getDefence()
    {
        return defence;
    }

    public int getBurn() {
        return 25;
    }
}

class Mage
{
    private int mana;
    private int extraHealth;

    public Mage()
    {
        mana = 100;
        extraHealth = 25;
    }

    public Mage(int mana, int extraHealth)
    {
        this.mana = mana;
        this.extraHealth = extraHealth;
    }

    public int getMana()
    {
        return mana;
    }

    public int getExtraHealth()
    {
        return extraHealth;
    }
}

interface FireType
{
    public int getBurn();
}