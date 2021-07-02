public class Airplane {
    protected String manufacturer, serialNumber;
    protected int maxSpeed;
    protected int serialNr;
    protected int numberWings = 1;
    protected final int loopSpeed = 320;

    public Airplane(String manufacturer, int maxSpeed, int numberWings) {
        this.manufacturer = manufacturer;
        this.maxSpeed = maxSpeed;
        this.numberWings = numberWings;
    }


    public String getSerialNr(){
        return Integer.toString(serialNr);
    }

    protected void setSerialNr(int serialnNr){
        this.serialNr = serialNr;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public boolean getLooping() {
        return this.getMaxSpeed() >= loopSpeed;
    }

}
