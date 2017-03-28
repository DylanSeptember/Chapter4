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

    private FireType fireType;

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
    public void testtest() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        fireType = (FireType) ctx.getBean("firetypeint");

    }

   @org.junit.Test
    public void testGetHealth() throws Exception {

        Character character = new Character(50, 50, 50);

        Assert.assertEquals(50, character.getHealth());
    }

    @org.junit.Test
    public void testGetExtraHealth() throws Exception {

        Character character = new Character(50, 50, 50);

        Assert.assertEquals(25, character.getExtraHealth());
    }

    @org.junit.Test
    public void testTotalHealth() throws Exception {

        Character character = new Character(50, 50, 50);

        Assert.assertEquals(75, (character.getHealth() + character.getExtraHealth()));
    }

    @org.junit.Test
    public void testAttack() throws Exception {

        Character character = new Character(50, 50, 50);

        Assert.assertEquals(50, character.getAttack());
    }

    @org.junit.Test
    public void testGetEnhancedAttack() throws Exception {

        Character character = new Character(50, 50, 50);

        Assert.assertEquals(75, character.getBurn() + character.getHealth());
    }

    @org.junit.Test
    public void testMana() throws Exception {

        Character character = new Character(50, 50, 50);

        Assert.assertEquals(100, character.getMana());
    }


}
