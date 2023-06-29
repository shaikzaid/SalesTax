package dsaProblems;

public class Product {
    private String name;
    private double price;
    private boolean imported;

    private int quantity;

 //   private double tax;


    public Product(String name, double price, boolean imported, int quantity) {
        this.name = name;
        this.price = price;
        this.imported = imported;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isImported() {
        return imported;
    }

    private double taxAmount;


    public void updatequantityPrice(int quantity) {
        price = (price + taxAmount) * quantity;
    }
    public void  updatePrice(){
        price=price+taxAmount;
    }


    public int getQuantity() {
        return quantity;
    }

}