package gerry.spring.api.shoppingcartinvoiceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class CreateASaleAPI {

    CreateASaleMethods myCreateASaleMethods = new CreateASaleMethods();
    Invoice myInvoice = new Invoice();

    @RequestMapping("/")
    String CreateASaleTestMethod() {
        return myCreateASaleMethods.CreateASaleTestMethod();
    }

    @RequestMapping("/createinvoice")
    String CreateAnInvoiceWithHardCodeValues() {
        return myCreateASaleMethods.CreateAnInvoiceWithHardCode();
    }

    @RequestMapping("/createinvoicefromparameters")
    String CreateAnInvoiceWithUserValues(@RequestParam("productid") String productId,
                                         @RequestParam("productdescription") String productDescription,
                                         @RequestParam("productquantity") int productQuantity,
                                         @RequestParam("productprice") double productPrice) {
        return myCreateASaleMethods.CreateAnInvoiceWithUserValues(productId, productDescription, productQuantity, productPrice);
    }

    @RequestMapping("/createinvoicejson")
    InvoiceObject jsonCustomerInvoice() {
        return myCreateASaleMethods.jsonCustomerInvoice();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(CreateASaleAPI.class, args);
    }
}
