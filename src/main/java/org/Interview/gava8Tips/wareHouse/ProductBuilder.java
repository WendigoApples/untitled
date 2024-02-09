package org.Interview.gava8Tips.wareHouse;


// Step 2: Create the Builder Class
public class ProductBuilder {
    private String name;
    private String description;
    private double price;

    public ProductBuilder() {}

    public ProductBuilder(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public ProductBuilder setName(String name) {
        this.name = name;
        return this; // Return the builder instance for method chaining
    }

    public ProductBuilder setDescription(String description) {
        this.description = description;
        return this; // Return the builder instance for method chaining
    }

    public ProductBuilder setPrice(double price) {
        this.price = price;
        return this; // Return the builder instance for method chaining
    }

    public Product build() {
        return new Product(name, description, price);
    }
}
