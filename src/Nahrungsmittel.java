public class Nahrungsmittel {
    //intialising variables
    private final double energie, fett, zucker, salz;
    private final String lebensmittelName;

    //constructor for setting variables
    public Nahrungsmittel(String lebensmittelName, double energie, double fett, double zucker, double salz) {
        this.lebensmittelName = lebensmittelName;
        this.energie = energie;
        this.fett = fett;
        this.zucker = zucker;
        this.salz = salz;
    }

    //function for returning information about as a string
    void info(){
        System.out.println(lebensmittelName + " - Energie: " + this.getEnergie() + " kcal, Fett: " + this.getFett()
                + "g (" + this.getAmpelFett() + ") , Zucker: " + this.getZucker() + "g (" + this.getAmpelZucker()
                + ") Salz: " + this.getSalz() + "g (" + this.getAmpelSalz() + ")");
    }

    /**
     * Setting get function for energy value
     *
     * @return double
     */
    public double getEnergie(){
        return energie;
    }

    /**
     * Setting get function for fat value
     *
     * @return double
     */
    public double getFett(){
        return fett;
    }

    /**
     * Setting get function for sugar value
     *
     * @return double
     */
    public double getZucker(){
        return zucker;
    }

    public double getSalz(){
        return salz;
    }

    public String getLebensmittelName(){
        return lebensmittelName;
    }
    /**
     * Returns a String based on set values for contents of fat in consumable
     *
     * @return String
     */
    public String getAmpelFett(){
        String result;
        if (this.getFett() < 3){
            result = "grün";
        }
        else if (this.getFett() > 17.5){
            result = "rot";
        }
        else{
            result =  "Gelb";
        }
        return result;
    }

    /**
     * Returns a String based on set values for contents of sugar in consumable
     * @return result
     */
    public String getAmpelZucker(){
        String result;
        if (this.getZucker() < 5){
            result = "grün";
        }
        else if (this.getZucker() > 22.5){
            result = "rot";
        }
        else{
            result =  "Gelb";
        }
        return result;
    }

    /**
     * Returns a String based on set values for contents of salt in consumable
     * @return result
     */
    public String getAmpelSalz(){
        String result;
        if (this.getSalz() < 0.3){
            result = "grün";
        }
        else if (this.getSalz() > 1.5){
            result = "rot";
        }
        else{
            result =  "Gelb";
        }
        return result;
    }

}
