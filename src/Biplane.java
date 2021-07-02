public class Biplane extends Airplane{

    boolean openCockpit;


    public Biplane(int serialNr, String manufacturer, int maxSpeed ) {
        super(manufacturer,maxSpeed,serialNr);
        this.openCockpit = true;
        this.numberWings = 2;
    }

    public Biplane(String manufacturer, int maxSpeed, int serialNr, boolean openCockpit){
        super(manufacturer,maxSpeed, serialNr);
        this.manufacturer = manufacturer;
        this.maxSpeed = maxSpeed;
        this.openCockpit = openCockpit;
        this.serialNr = serialNr;
        this.openCockpit = openCockpit;
        this.numberWings = 2;
        this.serialNumber = Integer.toString(this.serialNr);
    }




    public void getOpenCockpit(){
        System.out.println("Does this biplane have a open cockpit?" + this.openCockpit);
    }


}
