package gerry.spring.api.shoppingcartinvoiceapi;

public class InvoiceObject {
    private String productId;
    private String description;
    private int quantity ;
    private double itemPrice ;
    private double costBeforeVAT ;
    private double vatAmount;
    private double totalCost;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getCostBeforeVAT() {
        return costBeforeVAT;
    }

    public void setCostBeforeVAT(double costBeforeVAT) {
        this.costBeforeVAT = costBeforeVAT;
    }

    public double getVatAmount() {
        return vatAmount;
    }

    public void setVatAmount(double vatAmount) {
        this.vatAmount = vatAmount;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
