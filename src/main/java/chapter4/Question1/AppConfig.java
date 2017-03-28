package chapter4.Question1;

import org.springframework.context.annotation.Bean;

/**
 * Created by dylan on 3/29/2017.
 */
public class AppConfig {
    @Bean(name = "firetypeint")
    public FireType getFireType()
    {
        return new Character(50,50,50);
    }
}
