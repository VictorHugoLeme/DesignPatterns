package structural.adapter;

public class App {
    public static void main(String[] args) {
        Aircraft sailplane = new Aircraft("Salto H-101");
        PilotAdapter pilotOnPlane = new PilotAdapter(sailplane);

        System.out.print("Pushing the handle forwards: ");
        pilotOnPlane.pushForward();

        System.out.print("Pulling the handle backwards: ");
        pilotOnPlane.pullBack();

        System.out.print("Tilting the handle to the right: ");
        pilotOnPlane.tiltRight();

        System.out.print("Tilting the handle to the left: ");
        pilotOnPlane.tiltLeft();

        System.out.print("Reading the aircraft's name: ");
        pilotOnPlane.readAircraftName();
    }
}