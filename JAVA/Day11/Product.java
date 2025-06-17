package Day11.java;

public class Product {
	    String name;
	    double price;

	    Product(String n, double p) {
	        name = n;
	        price = p;
	    }

	    void displayDetails() {
	        System.out.println("Product Name: " + name);
	        System.out.println("Price: ₹" + price);
	        System.out.println("--------------------");
	    }

	    public static void main(String[] args) {
	        Product p1 = new Product("Keyboard", 799);
	        Product p2 = new Product("Mouse", 499);
	        Product p3 = new Product("Monitor", 8499);

	        p1.displayDetails();
	        p2.displayDetails();
	        p3.displayDetails();
	    }
	}


