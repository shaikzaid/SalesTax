
package dsaProblems;
import java.util.List;
import java.util.Scanner;
public class SalesTaxes {
    public static void main(String[] args) {

        productInput productInput = new ProductInputConsole();
        List<Product> products = productInput.getProductDetails();

        ItemList items = new ItemList();
        for (Product product : products) {
            items.calculateSalesTaxes();
            items.addProduct(product, product.getQuantity());

        }

        List<taxPrice> productOutputs = items.calculatePricesWithTax();
        for (taxPrice productOutput : productOutputs) {
           consolePrinter.printPriceWithTax(productOutput);
        }
        double salesTax = items.calculateSalesTaxes();
        consolePrinter.printSalesTax(salesTax);

        double total = items.calculateTotalSales();
        consolePrinter.printTotal(total,salesTax);
        }

    }
