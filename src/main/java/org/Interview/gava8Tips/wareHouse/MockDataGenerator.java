package org.Interview.gava8Tips.wareHouse;

import java.util.ArrayList;
import java.util.List;

public class MockDataGenerator {

    public static void main(String[] args) {
        // Generate mock user data
        String name = "Mike";
        String email = "ask@gmail.com";
        String gender = "Male";
        List<Product> products = generateMockProducts();

        // Construct JSON string
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{\n");
        jsonBuilder.append("  \"customer\": {\n");
        jsonBuilder.append("    \"name\": \"" + name + "\",\n");
        jsonBuilder.append("    \"email\": \"" + email + "\",\n");
        jsonBuilder.append("    \"gender\": \"" + gender + "\",\n");
        jsonBuilder.append("    \"products\": [\n");
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            jsonBuilder.append("      {\n");
            jsonBuilder.append("        \"pid\": " + product.getPid() + ",\n");
            jsonBuilder.append("        \"productName\": \"" + product.getProductName() + "\",\n");
            jsonBuilder.append("        \"price\": " + product.getPrice() + ",\n");
            jsonBuilder.append("        \"qty\": " + product.getQty() + "\n");
            jsonBuilder.append("      }");
            if (i < products.size() - 1) {
                jsonBuilder.append(",");
            }
            jsonBuilder.append("\n");
        }
        jsonBuilder.append("    ]\n");
        jsonBuilder.append("  }\n");
        jsonBuilder.append("}");

        String json = jsonBuilder.toString();
        System.out.println(json);
    }

    // Method to generate mock products
    private static List<Product> generateMockProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(201, "Rice Cooker", 10000, 1));
        products.add(new Product(215, "Laptop", 59984, 5));
        // Add more products if needed
        return products;
    }

    // Inner class representing a product
    private static class Product {
        private int pid;
        private String productName;
        private int price;
        private int qty;

        public Product(int pid, String productName, int price, int qty) {
            this.pid = pid;
            this.productName = productName;
            this.price = price;
            this.qty = qty;
        }

        public int getPid() {
            return pid;
        }

        public String getProductName() {
            return productName;
        }

        public int getPrice() {
            return price;
        }

        public int getQty() {
            return qty;
        }
    }
}
