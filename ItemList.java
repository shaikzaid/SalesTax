package dsaProblems;

import java.util.ArrayList;
import java.util.List;

public class ItemList {

    private List<Product> products;
    private BasicTaxCalculator basicTaxCalculator;
    private ImportedTaxCalculator importedTaxCalculator;

    public ItemList() {
        products = new ArrayList<>();
       basicTaxCalculator=new BasicTaxCalculator();
       importedTaxCalculator=new ImportedTaxCalculator();
    }

    public double calculateTotalSales() {
        double totalSales = 0;
        for (Product product : products) {
            totalSales += product.getPrice();
        }
        return totalSales;
    }
    public void addProduct(Product product, int quantity) {
        products.add(product);
        product.updatequantityPrice(quantity);


    }

    public double calculateSalesTaxes() {
        double salesTaxes = 0;
        double taxAmount = 0;
        for (Product product : products) {
           taxAmount= calculatePWithTax(product);
             salesTaxes += taxAmount;

        }
        return salesTaxes;
    }

    public double calculatePWithTax(Product product){
        double taxAmount=0;

        if (product.isImported()) {
            if (exemptedProducts.isExempted(product.getName())) {
                taxAmount = importedTaxCalculator.calculateTax(product.getPrice());
            } else {
                taxAmount = importedTaxCalculator.calculateTax(product.getPrice())
                        + basicTaxCalculator.calculateTax(product.getPrice());
            }
        } else {
            if (!exemptedProducts.isExempted(product.getName())) {
                taxAmount = basicTaxCalculator.calculateTax(product.getPrice());
            }
        }
        return taxAmount;
    }

    public List<taxPrice> calculatePricesWithTax() {
        List<taxPrice> productOutputs = new ArrayList<>();

        for (Product product : products) {
            double taxAmount = 0;
            taxAmount=calculatePWithTax(product);

            double priceWithTax = product.getPrice() + taxAmount;

            // Create a ProductOutput object
            taxPrice productOutput = new taxPrice(product.getQuantity(), product.getName(),product.isImported(), priceWithTax);

            // Add the ProductOutput object to the list
            productOutputs.add(productOutput);
            //product.updatePrice();
        }

        return productOutputs;
    }
}




