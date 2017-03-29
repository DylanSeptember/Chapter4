package chapter4.Question1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Mage mage = new Mage();
        Warrior warrior = new Warrior();


        System.out.println("Health: " + (mage.getCharacter().getHealth() + mage.getExtraHealth()));
        System.out.println("Atack: " + mage.getCharacter().getAttack());
        System.out.println("Enhanced Attack(Fire): " + (mage.getCharacter().getAttack() + mage.getBurn()));
        System.out.println("Defence: " + mage.getCharacter().getDefence());
        System.out.println("Mana: " + mage.getMana());

        System.out.println();


        System.out.println("Health: " + warrior.getCharacter().getHealth());
        System.out.println("Atack: " + warrior.getCharacter().getAttack());
        System.out.println("Enhanced Attack(Fire): " + (warrior.getCharacter().getAttack() + warrior.getBurn()));
        System.out.println("Defence: " + (warrior.getCharacter().getDefence() + warrior.getExtraDefence()));
        System.out.println("Stamina: " + warrior.getStamina());


    }


}

class Character
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


}
class Warrior implements FireType
{

    private int Stamina;
    private int extraDefence;
    private Character character;

    public Warrior()
    {
        Stamina = 100;
        extraDefence = 25 ;
        character = new Character();
    }

    public Warrior(int stamina, int extraDefence, Character character)
    {
        this.Stamina = stamina;
        this.extraDefence = extraDefence;
        this.character = character;
    }

    public int getStamina()
    {
        return Stamina;
    }

    public int getExtraDefence()
    {
        return extraDefence;
    }

    public Character getCharacter()
    {
        return character;
    }

    public int getBurn() {
        return (25+Stamina);
    }
}

class Mage implements FireType
{

    private int mana;
    private int extraHealth;
    private Character character;

    public Mage()
    {
        mana = 100;
        extraHealth = 25;
        character = new Character();
    }



    public Mage(int mana, int extraHealth, Character character)
    {
        this.mana = mana;
        this.extraHealth = extraHealth;
        this.character = character;
    }

    public int getMana()
    {
        return mana;
    }

    public int getExtraHealth()
    {
        return extraHealth;
    }

    public Character getCharacter()
    {
        return character;
    }

    public int getBurn() {

        return (25+(int)mana);
    }
}

interface FireType
{
    public int getBurn();
}