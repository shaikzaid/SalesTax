package dsaProblems;

import java.util.ArrayList;
import java.util.List;

public class ItemList {

    private List<Product> products;
    private BasicTaxCalculator basicTaxCalculator;
    private ImportedTaxCalculator importedTaxCalculator;

    public static double price1;

    public ItemList() {
        products = new ArrayList<>();
       basicTaxCalculator=new BasicTaxCalculator();
       importedTaxCalculator=new ImportedTaxCalculator();
    }

      public List<Product> getProducts() {
        return products;
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

           //if product is imported then check wheather it belongs to exempted category
            if (product.isImported()) {
                if(exemptedProducts.isExempted(product.getName())){
                taxAmount = importedTaxCalculator.calculateTax(product.getPrice());
                }
                else {
                    taxAmount = importedTaxCalculator.calculateTax(product.getPrice())+ basicTaxCalculator.calculateTax(product.getPrice());
                }
            }
             else {
                if(!exemptedProducts.isExempted(product.getName())){
                taxAmount = basicTaxCalculator.calculateTax(product.getPrice());}
            }
             salesTaxes += taxAmount;

        }
        return salesTaxes;
    }
}



