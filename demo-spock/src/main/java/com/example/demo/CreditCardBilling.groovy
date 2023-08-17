package com.example.demo

class CreditCardBilling {

    public void charge(Client client, double amount) {
        client.setBonus(amount>100);
    }

}
