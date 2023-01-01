import org.springframework.boot.SpringApplication;
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

    @RequestMapping("/quotationamount")
    public double calculateQuotationAmount(@RequestParam("propertyage") int ageOfProperty,
                                           @RequestParam("propertylocation") String cityOfProperty,
                                           @RequestParam("propertyvalue") double propertyValue) {
        return myQuoteMethods.calculateQuotationAmount(ageOfProperty, cityOfProperty, propertyValue);
    }

    @RequestMapping("/addquotationdetailstoarray")
    public void addQuotationDetailsToArray(@RequestParam("propertyage") int ageOfProperty,
                                           @RequestParam("propertylocation") String cityOfProperty,
                                           @RequestParam("propertyvalue") double propertyValue) {
        myQuoteMethods.addQuotationDetailsToArray(ageOfProperty, cityOfProperty, propertyValue);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(QuoteMethodsAPI.class);
    }
}
