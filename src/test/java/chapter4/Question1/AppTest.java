package chapter4.Question1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest

{

    private FireType fireType1;
    private FireType fireType2;

   @Before
   public void setUp()
   {
       System.out.println("In Before Class");
   }

    @org.junit.Test
public void testCharacterInstance() throws Exception {

    Character character = new Character(50, 50, 50);


    Assert.assertNotNull(character);
}

    @Before
    public void testMageInstance() throws Exception {

        Mage mage = new Mage();


        Assert.assertNotNull(mage);
    }

    @Before
    public void testBean1() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        fireType1 = (FireType) ctx.getBean("firetypeint1");

    }

    @Before
    public void testBean2() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        fireType2 = (FireType) ctx.getBean("firetypeint2");

    }

   @org.junit.Test
    public void testGetHealth() throws Exception {

       Mage mage = new Mage(50, 50, new Character(50,50,50));

        Assert.assertEquals(50, mage.getCharacter().getHealth());
    }

    @org.junit.Test
    public void testGetExtraHealth() throws Exception {

        Mage mage = new Mage(50, 50, new Character(50,50,50));

        Assert.assertEquals(50, mage.getExtraHealth());
    }

    @org.junit.Test
    public void testTotalHealth() throws Exception {

        Mage mage = new Mage(50, 50, new Character(50,50,50));

        Assert.assertEquals(100, (mage.getCharacter().getHealth() + mage.getExtraHealth()));
    }

    @org.junit.Test
    public void testAttack() throws Exception {

        Character character = new Character(50,50,50);

        Assert.assertEquals(50, character.getAttack());
    }

    @org.junit.Test
    public void testGetEnhancedAttack() throws Exception {

        Mage mage = new Mage(50, 50,new Character(50,50,50));

        Assert.assertEquals(125, mage.getBurn() + mage.getCharacter().getAttack());
    }

    @org.junit.Test
    public void testMana() throws Exception {

        Mage mage = new Mage(50, 50,new Character(50,50,50));

        Assert.assertEquals(50, mage.getMana());
    }




















    @org.junit.Test
    public void testGetHealth2() throws Exception {

        Warrior warrior = new Warrior(50, 50, new Character(50,50,50));

        Assert.assertEquals(50, warrior.getCharacter().getHealth());
    }

    @org.junit.Test
    public void testGetExtraDefence() throws Exception {

        Warrior warrior = new Warrior(50, 50, new Character(50,50,50));

        Assert.assertEquals(50, warrior.getExtraDefence());
    }

    @org.junit.Test
    public void testTotalDefence() throws Exception {

        Warrior warrior = new Warrior(50, 50, new Character(50,50,50));

        Assert.assertEquals(100, (warrior.getCharacter().getDefence() + warrior.getExtraDefence()));
    }

    @org.junit.Test
    public void testAttack2() throws Exception {

        Character character = new Character(50,50,50);

        Assert.assertEquals(50, character.getAttack());
    }

    @org.junit.Test
    public void testGetEnhancedAttack2() throws Exception {

        Warrior warrior = new Warrior(50, 50, new Character(50,50,50));

        Assert.assertEquals(125, warrior.getBurn() + warrior.getCharacter().getAttack());
    }

    @org.junit.Test
    public void testStamina() throws Exception {

        Warrior warrior = new Warrior(50, 50, new Character(50,50,50));

        Assert.assertEquals(50, warrior.getStamina());
    }


}
