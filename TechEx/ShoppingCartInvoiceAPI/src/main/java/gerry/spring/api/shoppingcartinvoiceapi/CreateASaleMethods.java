package gerry.spring.api.shoppingcartinvoiceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@EnableAutoConfiguration
public class CreateASaleMethods {

    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    Date date = new Date();

    String CreateASaleTestMethod() {
        return "Create a sale for the product";
    }

    String CreateAnInvoiceWithHardCodeValues() {
        System.out.println(dateFormat.format(date));
        Product customerProduct = new Product("T15555", "Java Beginners", 5, 10.0);
    }

    String CreateAnInvoiceWithUserValues(String productId, String productDescription, int productQuantity, double productPrice) {
        Product customerProduct = new Product(productId, productDescription, productQuantity, productPrice);
    }

    InvoiceObject jsonCustomerInvoice() {
        InvoiceObject myInvoiceObject = new InvoiceObject();
        myInvoiceObject.setProductId("T01234");
    }
}
