package com.oreilly.restclient.services;

import com.oreilly.restclient.json.AstroResponse;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class AstroServiceTest {
    private final Logger logger = LoggerFactory.getLogger(AstroService.class);

    @Autowired
    private AstroService service;

    @Test
    void getPeople() {
        String people = service.getPeople();
        assertNotNull(people);
        System.out.println(people);
    }

    @Test
    void getAstroResponse() {
        // LVTI -- Local Variable Type Inference
        var response = service.getAstroResponse();
        assertNotNull(response);
        assertAll(
                () -> assertThat(response.getMessage()).isEqualTo("success"),
                () -> assertThat(response.getNumber()).isGreaterThanOrEqualTo(0),
                () -> assertThat(response.getPeople()).size().isEqualTo(response.getNumber())
        );
        System.out.println("There are " + response.getNumber() + " people in space.");
        response.getPeople().forEach(assignment ->
                System.out.println(assignment.getName() + " is aboard " + assignment.getCraft()));
    }


    @Test
    void getAstroResponseRT() {
        ResponseEntity<AstroResponse> responseEntity = service.getAstroResponseRT();
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getHeaders().getContentType()).isEqualTo(MediaType.APPLICATION_JSON);
        AstroResponse response = responseEntity.getBody();
        assertNotNull(response);
        assertAll(
                () -> assertThat(response.getMessage()).isEqualTo("success"),
                () -> assertThat(response.getNumber()).isGreaterThanOrEqualTo(0),
                () -> assertThat(response.getPeople()).size().isEqualTo(response.getNumber())
        );
    }
}