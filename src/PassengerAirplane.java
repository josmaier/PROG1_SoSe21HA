public class PassengerAirplane extends Airplane{

    protected int passengers;

    public PassengerAirplane(String manufacturer, int maxSpeed, int numberWings, String serialNumber, int passengers) {
        super(manufacturer, maxSpeed, numberWings);
        this.serialNumber = serialNumber;
        this.passengers = passengers;
        this.numberWings = 1;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public boolean getLooping() {
        return false;
    }
}
