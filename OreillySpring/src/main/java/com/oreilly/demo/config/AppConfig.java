package com.oreilly.demo.config;

import com.oreilly.demo.json.Greeting;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import java.text.NumberFormat;
import java.util.Locale;

@Configuration
public class AppConfig {

    @Bean
    public NumberFormat defaultCurrencyFormat() {
        return NumberFormat.getCurrencyInstance(Locale.US);
    }

    @Bean
    public NumberFormat indianCurrencyFormat() {
        return NumberFormat.getCurrencyInstance(
                new Locale("hin", "IN"));
    }

    @Bean @Lazy // @Scope("prototype")
    public Greeting greeting() {
        System.out.println("Creating a greeting bean.");
        return new Greeting("Hello, World!");
    }
}
