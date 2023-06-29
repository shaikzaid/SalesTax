package dsaProblems;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class ProductInputConsole implements productInput {
        @Override
        public List<Product> getProductDetails() {
            List<Product> products = new ArrayList<>();
            Scanner scn = new Scanner(System.in);

            System.out.println("Please enter the product details (one product per line):");
            System.out.println("Format:<quantity>, <imported (y/n)>, <name>, <price>");

            while (true) {
                String input = scn.nextLine();
                if (input.isEmpty()) {
                    break;
                }

                String[] productDetails = input.split(", ");
                int quantity = Integer.parseInt(productDetails[0]);
                boolean imported = productDetails[1].equalsIgnoreCase("y");
                String name = productDetails[2];
                double price = Double.parseDouble(productDetails[3]);
                double tax=0;

                Product product = new Product(name, price, imported, quantity);
                products.add(product);
            }

            return products;
        }
    }


