package structural.adapter;

public class PilotAdapter extends AircraftPilot {

    private final Aircraft aircraft;

    public PilotAdapter(Aircraft aircraft) {

        this.aircraft = aircraft;
    }

    @Override
    public void pullBack() {
        aircraft.goUp();
    }
    @Override
    public void pushForward() {
        aircraft.goDown();
    }
    @Override
    public void tiltRight() {
        aircraft.turnRight();
    }
    @Override
    public void tiltLeft() {
        aircraft.turnLeft();
    }
    @Override
    public void readAircraftName() {
        aircraft.getAircraftName();
    }
}
