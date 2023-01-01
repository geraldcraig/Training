package gerry.spring.api.shoppingcartinvoiceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class MessagesAPI {

    MessageQueue myMessageQueue = new MessageQueue();

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MessagesAPI.class, args);
    }
}
