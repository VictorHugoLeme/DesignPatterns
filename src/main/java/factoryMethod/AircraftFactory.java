package factoryMethod;

public class AircraftFactory {
    public static Aircraft createAircraft(int numberOfEngines) {
        if (numberOfEngines == 0) {
            return new Sailplane();
        } else if (numberOfEngines == 1) {
            return new SingleEngine();
        } else if (numberOfEngines == 2) {
            return new TwinEngine();
        }
        return null;
    }
}