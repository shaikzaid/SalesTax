package dsaProblems;
import java.util.List;
import java.util.Scanner;

//import static dsaProblems.consolePrinter.printProductWithPrice;

public class SalesTaxes {
    public static void main(String[] args) {

        productInput productInput = new ProductInputConsole();
        List<Product> products = productInput.getProductDetails();

        ItemList items = new ItemList();
        for (Product product : products) {
            items.addProduct(product, product.getQuantity());
        }
        List<Product> products1 = items.getProducts();
        for (Product product : products1) {
            consolePrinter.printProduct(product);
        }

        double salesTax = items.calculateSalesTaxes();
        consolePrinter.printSalesTax(salesTax);

        double total = items.calculateTotalSales();
        consolePrinter.printTotal(total,salesTax);


        }
    }
