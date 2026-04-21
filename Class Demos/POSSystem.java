// Simple Point of Sale (POS) System - Java Console Application
// Suitable for university submission and easy explanation

import java.util.*;

// Product class
class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

// Cart Item class
class CartItem {
    Product product;
    int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotal() {
        return product.price * quantity;
    }
}

// Main POS System
public class POSSystem {

    static List<Product> products = new ArrayList<>();
    static List<CartItem> cart = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        seedProducts();
        menu();
    }

    // Preload products
    static void seedProducts() {
        products.add(new Product(1, "Book", 10.0));
        products.add(new Product(2, "Pen", 2.5));
        products.add(new Product(3, "Notebook", 5.0));
        products.add(new Product(4, "Bag", 20.0));
    }

    // Main menu
    static void menu() {
        while (true) {
            System.out.println("\n=== POINT OF SALE SYSTEM ===");
            System.out.println("1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> viewProducts();
                case 2 -> addToCart();
                case 3 -> viewCart();
                case 4 -> checkout();
                case 5 -> {
                    System.out.println("Thank you!");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    // Display products
    static void viewProducts() {
        System.out.println("\nAvailable Products:");
        for (Product p : products) {
            System.out.println(p.id + ". " + p.name + " - $" + p.price);
        }
    }

    // Add product to cart
    static void addToCart() {
        viewProducts();
        System.out.print("Enter product ID: ");
        int id = scanner.nextInt();

        Product selected = null;
        for (Product p : products) {
            if (p.id == id) {
                selected = p;
                break;
            }
        }

        if (selected == null) {
            System.out.println("Product not found");
            return;
        }

        System.out.print("Enter quantity: ");
        int qty = scanner.nextInt();

        cart.add(new CartItem(selected, qty));
        System.out.println("Added to cart!");
    }

    // View cart
    static void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty");
            return;
        }

        System.out.println("\nYour Cart:");
        double total = 0;

        for (CartItem item : cart) {
            double itemTotal = item.getTotal();
            total += itemTotal;
            System.out.println(item.product.name + " x" + item.quantity + " = $" + itemTotal);
        }

        System.out.println("Total: $" + total);
    }

    // Checkout
    static void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty");
            return;
        }

        double total = 0;
        for (CartItem item : cart) {
            total += item.getTotal();
        }

        System.out.println("Total amount: $" + total);
        System.out.print("Enter payment amount: ");
        double payment = scanner.nextDouble();

        if (payment < total) {
            System.out.println("Insufficient payment");
            return;
        }

        double change = payment - total;
        System.out.println("Payment successful!");
        System.out.println("Change: $" + change);

        cart.clear();
    }
}
