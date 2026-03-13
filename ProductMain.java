package Product;

import java.util.Scanner;

public class ProductMain {

    // Method to calculate total amount spent
    static double totalAmount(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.price * p.quantity;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accept 5 products
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Product " + (i + 1) + " details:");

            int pid = sc.nextInt();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        // Find product with highest price
        int maxPid = products[0].pid;
        double maxPrice = products[0].price;

        for (int i = 1; i < products.length; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                maxPid = products[i].pid;
            }
        }

        System.out.println("Product ID with highest price: " + maxPid);
        System.out.println("Total amount spent: " + totalAmount(products));
    }
}
