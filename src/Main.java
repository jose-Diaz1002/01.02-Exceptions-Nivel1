import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product1 = new Product("Hat", 20);
        Product product2 = new Product("Shirt", 30);
        Product product3 = new Product("Pants", 50);
        Product product4 = new Product("Shoes", 70);

        Sale sales = new Sale();
        int option;
        do {
            System.out.println("\n=== Choose a product ===");
            System.out.println("1. Hat");
            System.out.println("2. Shirt");
            System.out.println("3. Pants");
            System.out.println("4. Shoes");
            System.out.println("5. Total");
            System.out.println("6. Exit and Final Total");
            System.out.print("Choose an option: ");

            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("\nHat added to the shopping cart");
                    sales.addProducts(product1);
                    break;
                case 2:
                    System.out.println("\nShirt added to the shopping cart");
                    sales.addProducts(product2);
                    break;
                case 3:
                    System.out.println("\nPants added to the shopping cart");
                    sales.addProducts(product3);
                    break;
                case 4:
                    System.out.println("\nShoes added to the shopping cart");
                    sales.addProducts(product4);
                    break;
                case 5:
                    try {
                        sales.calculateTotal();
                    } catch (EmptySaleException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        sales.calculateTotal();
                    } catch (EmptySaleException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        } while (option != 6);
    }
}
