package structural.adapter;

public class Aircraft {

    String name;

    public Aircraft(String name) {
        this.name = name;
    }

    public void goUp() {
        System.out.println("Airplane tilts up.");
    }
    public void goDown() {
        System.out.println("Airplane tilts down.");
    }
    public void turnRight() {
        System.out.println("Airplane tilts right.");
    }
    public void turnLeft() {
        System.out.println("Airplane tilts left.");
    }
    public void getAircraftName() {
        System.out.println(this.name);
    }
}