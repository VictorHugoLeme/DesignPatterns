package structural.facade;

public class Book implements Product {

    String name;
    int quantity;

    public Book(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public int getQuantity() {
        return this.quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
