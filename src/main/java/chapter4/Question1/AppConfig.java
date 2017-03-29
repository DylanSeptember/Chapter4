package chapter4.Question1;

import org.springframework.context.annotation.Bean;

/**
 * Created by dylan on 3/29/2017.
 */
public class AppConfig {
    @Bean(name = "firetypeint1")
    public FireType getFireTypeMage()
    {
        return new Mage(50,50, new Character());
    }

    @Bean(name = "firetypeint2")
    public FireType getFireTypeWarrior()
    {
        return new Warrior(50,50, new Character());
    }
}
