package factoryMethod;

public class TwinEngine implements Aircraft {

    public String getDescription() {
        return "Twin-engined airplane.";
    }
    public int getEngines() {
        return 2;
    }
}