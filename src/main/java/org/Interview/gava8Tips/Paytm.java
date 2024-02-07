package org.Interview.gava8Tips;

public class Paytm implements UOIPayment {


    // When a user is doing a payment I want to return transaction ID and date of payment
    @Override
    public String doPayment(String source, String dest) {
        String transactionDate = UOIPayment.datePatterns("yyyy-MM-dd");
        return null;
    }

    @Override
    public double getScratchCard() {
        return UOIPayment.super.getScratchCard();
    }
}
