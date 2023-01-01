import java.util.ArrayList;
import java.util.Scanner;

public class QuoteMethods {
    Scanner myScanner = new Scanner(System.in);
    double ageInsuranceAmount = 0.00;
    double locationInsuranceAmount = 0.00;
    double quotationAmount = 0.00;
    double propertyValue = 0.00;
    ArrayList QuoteDetails = new ArrayList();

    String createASaleTestMethod() {
        return "API Working";
    }

    public int askForPropertyAge() {
        int propertyAge;
        System.out.println("How old is the property?");
        propertyAge = myScanner.nextInt();
        myScanner.nextLine();
        return propertyAge;
    }

    public String askForPropertyCity() {
        String propertyCity;
        System.out.println("What city is the property in?");
        propertyCity = myScanner.nextLine();
        return propertyCity;
    }

    public double askForPropertyValue() {
        System.out.println("What is the current value of the property?");
        propertyValue = myScanner.nextDouble();
        myScanner.nextLine();
        return propertyValue;
    }

    public double calculateAgeInsuranceAmount(int propertyAge) {
        if (propertyAge >= 0 && propertyAge <= 5) {
            ageInsuranceAmount = 400.00;
        } else if (propertyAge >= 6 && propertyAge <= 10) {
            ageInsuranceAmount = 300.00;
        } else if (propertyAge >= 11 && propertyAge <= 20) {
            ageInsuranceAmount = 200.00;
        } else {
            ageInsuranceAmount = 100.00;
        }
        return ageInsuranceAmount;
    }

    public double calculateLocationInsuranceAmount(String propertyCity) {
        if (propertyCity.equals("New York")) {
            locationInsuranceAmount = 500.00;
        } else if (propertyCity.equals("Chicago")) {
            locationInsuranceAmount = 400.00;
        } else if (propertyCity.equals("Dallas")) {
            locationInsuranceAmount = 300.00;
        } else if (propertyCity.equals("Charlotte")) {
            locationInsuranceAmount = 200.00;
        } else {
            locationInsuranceAmount = 0.00;
        }
        return locationInsuranceAmount;
    }

    public double calculateQuotationAmount(int ageOfProperty, String cityOfProperty, double propertyValue) {
        quotationAmount = (calculateAgeInsuranceAmount(ageOfProperty) + calculateLocationInsuranceAmount(cityOfProperty)
        * (propertyValue / 500000));
        return quotationAmount;
    }

    public void addQuotationDetailsToArray(int ageOfProperty, String cityOfProperty, double propertyValue) {
        QuoteDetails.add(ageOfProperty);
        QuoteDetails.add(cityOfProperty);
        QuoteDetails.add(propertyValue);
        QuoteDetails.add(calculateQuotationAmount(ageOfProperty, cityOfProperty, propertyValue));
        displayQuoteAmountFromArray(QuoteDetails);
    }

    private void displayQuoteAmountFromArray(ArrayList quoteDetails) {
        for (Object item: quoteDetails) {
            System.out.println("Item in array is: " + item);
        }
    }
}
