package com.thiagomuller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
@ComponentScan("com.thiagomuller")
public class SportConfig {


    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    @Bean
    public Coach swinCoach(){
        return new SwinCoach();
    }
}
