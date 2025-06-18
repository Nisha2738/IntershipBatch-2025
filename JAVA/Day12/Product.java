package Day12.java;

class Product {
    private int productId;
    private String name;
    private double price;

    public void setProductId(int id) {
        productId = id;
    }

    public void setName(String productName) {
        name = productName;
    }

    public void setPrice(double productPrice) {
        price = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.setProductId(101);
        p.setName("Bluetooth Speaker");
        p.setPrice(2499.99);

        p.displayDetails();
    }
}
