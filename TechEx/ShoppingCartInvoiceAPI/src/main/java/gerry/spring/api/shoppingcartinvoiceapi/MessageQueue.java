package gerry.spring.api.shoppingcartinvoiceapi;

public class MessageQueue {
    public Boolean addMessage(String message) {
        return (writeArrayListToTextFile(message));
    }
}
