package gerry.spring.api.shoppingcartinvoiceapi;

public class Product {
    private final String productId;
    private final String description;
    private final int quantity;
    private final double itemPrice;

    public Product(String productId, String description, int quantity, double itemPrice) {
        this.productId = productId;
        this.description = description;
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public String getProductId() {
        return productId;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String VATCodeOfProduct() {
        return productId.substring(0, 2);
    }

    public double calculateVATRate() {
        switch (this.VATCodeOfProduct()) {
            case"T0":
            {
                return 0.0;
            }
            case"T1":
            {
                return 0.2;
            }
            case"T2":
            {
                return 0.05;
            }
            default:
            {
                return 100.0;
            }
        }
    }

    public double calculateVATAmount() {
        return calculateVATRate() * this.quantity * this.itemPrice;
    }

    public double calculateTotalCost() {
        return calculateVATAmount() * this.quantity * this.itemPrice;
    }
}
