package creational.builder;

public class App {
    public static void main(String[] args) {
        Name name = new Name.Builder().name("Corner Bar").suffix("CB-102").build();
        Hardware hardware = new Hardware.Builder().hingeCount(8).drawerSlideCount(2).pullCount(6).footCount(4).build();
        Size size = new Size.Builder().height(2100).width(900).depth(400).build();
        Furniture furniture = new Furniture.Builder().hardware(hardware).name(name).size(size).id(1).build();
    }
}