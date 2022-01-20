package creational.factoryMethod;

public class SingleEngine implements Aircraft {

    public String getDescription() {
        return "Single engined Airplane.";
    }
    public int getEngines() {
        return 1;
    }
}