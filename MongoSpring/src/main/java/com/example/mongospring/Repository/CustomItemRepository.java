package com.example.mongospring.Repository;

public interface CustomItemRepository {

    void updateItemQuantity(String itemName, float newQuantity);

}
