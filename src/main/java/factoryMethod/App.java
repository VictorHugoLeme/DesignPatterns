package factoryMethod;

public class App {
    public static void main(String[] args) {
        Aircraft aircraft0 = AircraftFactory.createAircraft(0);
        System.out.println(aircraft0.getDescription());
        System.out.print("Engines: ");
        System.out.println(aircraft0.getEngines());

        Aircraft aircraft1 = AircraftFactory.createAircraft(1);
        System.out.println(aircraft1.getDescription());
        System.out.print("Engines: ");
        System.out.println(aircraft1.getEngines());

        Aircraft aircraft2 = AircraftFactory.createAircraft(2);
        System.out.println(aircraft2.getDescription());
        System.out.print("Engines: ");
        System.out.println(aircraft2.getEngines());

    }
}