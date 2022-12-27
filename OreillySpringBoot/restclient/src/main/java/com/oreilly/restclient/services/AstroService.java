package com.oreilly.restclient.services;

import com.oreilly.restclient.json.AstroResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.time.Duration;


// 3-layer Java architecture used for the last 20 years
// 1. Presentation layer (controllers and views)
// 2. Service layer (business logic and transaction boundaries)
// 3. Persistence layer (convert Java classes to database tables)

@Service
public class AstroService {

    private final WebClient client;
    private final RestTemplate template;

    @Autowired
    public AstroService(RestTemplateBuilder builder) {
        this.client = WebClient.create("http://api.open-notify.org");
        this.template = builder.build();
    }

    public ResponseEntity<AstroResponse> getAstroResponseRT() {
        return template.getForEntity("http://api.open-notify.org/astros.json", AstroResponse.class);
    }

    public String getPeople() {
        return client.get()
                .uri("/astros.json")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

    public AstroResponse getAstroResponse() {
        return client.get()
                .uri("/astros.json")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(AstroResponse.class)
                .block(Duration.ofSeconds(2));
    }
}
