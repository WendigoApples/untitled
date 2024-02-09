package org.Interview.gava8Tips.wareHouse;


// Step 3: Usage Example
public class Main {
    public static void main(String[] args) {

        Product product = new ProductBuilder()
                .setName("Phone")
                .setDescription("Smartphone with advanced features")
                .setPrice(999.99)
                .build();
        System.out.println(product);
    }
}