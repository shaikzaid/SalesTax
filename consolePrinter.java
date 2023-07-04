package dsaProblems;

public class consolePrinter {
   public static void printPriceWithTax(taxPrice taxPrice){
        if(taxPrice.isImported()){
        System.out.println(taxPrice.getQuantity()+" imported "+taxPrice.getName()+" "+roundedValue(taxPrice.getPriceWithTax()));}
        else {
            System.out.println(taxPrice.getQuantity()+" "+taxPrice.getName()+" :"+roundedValue(taxPrice.getPriceWithTax()));
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
