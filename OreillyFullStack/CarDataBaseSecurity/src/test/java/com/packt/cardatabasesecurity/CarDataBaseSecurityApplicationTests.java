package com.packt.cardatabasesecurity;

import static org.assertj.core.api.Assertions.assertThat;

import com.packt.cardatabasesecurity.web.CarController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class CarDataBaseSecurityApplicationTests {
    @Autowired
    private CarController controller;

    @Test
    @DisplayName("First example test case")
    void contextLoads() {
        assertThat(controller).isNotNull();
    }
}
