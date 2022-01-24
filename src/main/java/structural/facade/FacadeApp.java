package structural.facade;

public class App {
    public static void main(String[] args) {
        StoreFacade store = new StoreFacade();

        store.buyProduct("Angels and Demons", 15);
    }
}
