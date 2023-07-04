package dsaProblems;

public class taxPrice {
    private int quantity;
    private String name;
    private double priceWithTax;

    private boolean imported;


    public taxPrice(int quantity, String name, boolean imported, double priceWithTax) {
        this.quantity=quantity;
        this.name=name;
        this.priceWithTax=priceWithTax;
        this.imported=imported;
    }

    public double getPriceWithTax() {
        return Double.parseDouble(roundedValue(priceWithTax));
    }
    public boolean isImported(){
        return imported;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }


    private String roundedValue(double value) {
        double roundedValue = Math.round(value * 20) / 20.0;
        return String.format("%.2f", roundedValue);
    }
}
