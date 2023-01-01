package gerry.spring.api.quoteassignmentwithapi;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class QuoteMethodsAPI {
    QuoteMethods myQuoteMethods = new QuoteMethods();

    @RequestMapping("/")
    String createASaleTestMethod() {
        return myQuoteMethods.createASaleTestMethod();
    }

    @RequestMapping("/propertyageamount")
    public double calculateAgeInsuranceAmount(@RequestParam("propertyage") int propertyAge) {
        return myQuoteMethods.calculateAgeInsuranceAmount(propertyAge);
    }

    @RequestMapping("/locationamount")
    public double calculateLocationInsuranceAmount(@RequestParam("propertylocation") String propertyCity) {
        return myQuoteMethods.calculateLocationInsuranceAmount(propertyCity);
    }
}
