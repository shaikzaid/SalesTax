package dsaProblems;

public class consolePrinter {
    public static void printProduct(Product product) {
        if(product.isImported()){
        System.out.println(+product.getQuantity()+" Imported "+product.getName() + " :" +roundedValue(product.getPrice())+" ");
    }
        else {
            System.out.println(+product.getQuantity()+" "+product.getName() + " " +roundedValue(product.getPrice()));
        }
    }

    public static void printSalesTax(double salesTax) {
        System.out.println("Sales Tax = " + roundedValue(salesTax));
    }

    public static void printTotal(double total,double salesTax) {
        System.out.println("Total = " + roundedValue(total+salesTax));
    }

    private static String roundedValue(double value) {
        double roundedValue = Math.round(value * 20) / 20.0;
        return String.format("%.2f", roundedValue);
    }
}
