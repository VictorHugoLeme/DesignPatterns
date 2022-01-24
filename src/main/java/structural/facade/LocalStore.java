package structural.facade;

public class StoreFacade {


    public static void main(String[] args) {
        Supplier papelariaReal = new Supplier("Papelaria Real");

        papelariaReal.buyFromSupplier("Angels and Demons", 10);
        papelariaReal.buyFromSupplier("Angels and Demons", 10);
    }
}
