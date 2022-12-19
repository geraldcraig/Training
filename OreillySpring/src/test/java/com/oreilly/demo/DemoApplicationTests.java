package com.oreilly.demo;

import com.oreilly.demo.json.Greeting;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.text.NumberFormat;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private ApplicationContext context;

    @Test
    void contextLoads() {
        int count = context.getBeanDefinitionCount();
        System.out.println("There are " + count + " beans in the application context.");
        for (String name : context.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }

    @Test @Disabled("Added Greeting bean to AppConfig")
    void noGreetingBeanInAppCtx() {
        assertThrows(NoSuchBeanDefinitionException.class, () -> context.getBean(Greeting.class));
    }

    @Test
    void formatUSCurrency() {
        NumberFormat usFormat = context.getBean("defaultCurrencyFormat", NumberFormat.class);
        String result = usFormat.format(1234567.890123456);
        System.out.println(result);
    }

    @Test
    void formatIndianCurrency() {
        NumberFormat indianFormat = context.getBean("indianCurrencyFormat", NumberFormat.class);
        String result = indianFormat.format(1234567.890123456);
        System.out.println(result);
    }

    @Test
    void getGreetingBeanTwice() {
        Greeting greeting1 = context.getBean((Greeting.class));
        Greeting greeting2 = context.getBean((Greeting.class));
        System.out.println(greeting1);
        System.out.println(greeting2);

        greeting1.setMessage("Hello, Spring!");
        System.out.println(greeting1);
        System.out.println(greeting2);

        // Spring manages beans as singletons by default
        assertSame(greeting1, greeting2);
    }
}


