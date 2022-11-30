package koschei.config;

import koschei.models.Duck5;
import koschei.models.Egg6;
import koschei.models.Island2;
import koschei.models.Wood3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }
    @Bean
    public static Duck5 getDuck5 (Egg6 egg6){return  new Duck5(egg6);}
}
