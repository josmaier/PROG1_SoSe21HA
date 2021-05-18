public class Nahrungsmittel {
    /**
     * Initialising variables for class
     */
    private final double energie, fett, zucker, salz;
    private final String lebensmittelName;

    /**
     * Constructor for a new object of the class Nahrungsmittel
     *
     * @param lebensmittelName String Name of comestible
     * @param energie          Double Energy value for comestible per 100g
     * @param fett             Double Fat value for comestible per 100g
     * @param zucker           Double Sugar value for comestible per 100g
     * @param salz             Double Salt value for comestible per 100g
     */
    public Nahrungsmittel(String lebensmittelName, double energie, double fett, double zucker, double salz) {
        this.lebensmittelName = lebensmittelName;
        this.energie          = energie;
        this.fett             = fett;
        this.zucker           = zucker;
        this.salz             = salz;
    }

    /**
     * Method prints string with information about given comestible
     */
    void info() {
        System.out.println(this.getLebensmittelName() + " - Energie: " + this.getEnergie() + " kcal, Fett: "
                + this.getFett() + "g (" + this.getAmpelFett() + ") , Zucker: " + this.getZucker() + "g ("
                + this.getAmpelZucker() + ") Salz: " + this.getSalz() + "g (" + this.getAmpelSalz() + ")");
    }

    /**
     * Getter for energy value
     *
     * @return double
     */
    public double getEnergie() {
        return this.energie;
    }

    /**
     * Getter for fat value
     *
     * @return double
     */
    public double getFett() {
        return this.fett;
    }

    /**
     * Getter for sugar value
     *
     * @return double
     */
    public double getZucker() {
        return this.zucker;
    }

    /**
     * Getter for salt value
     *
     * @return double
     */
    public double getSalz() {
        return this.salz;
    }

    /**
     * Setting get function for name
     *
     * @return String
     */
    public String getLebensmittelName() {
        return this.lebensmittelName;
    }

    /**
     * Returns a String based on set values for contents of fat in comestible
     *
     * @return String
     */
    public String getAmpelFett() {
        String result;
        if (this.getFett() < 3) {
            result = "grün";
        } else if (this.getFett() > 17.5) {
            result = "rot";
        } else {
            result = "Gelb";
        }
        return result;
    }

    /**
     * Returns a String based on set values for contents of sugar in comestible
     *
     * @return String
     */
    public String getAmpelZucker() {
        String result;
        if (this.getZucker() < 5) {
            result = "grün";
        } else if (this.getZucker() > 22.5) {
            result = "rot";
        } else {
            result = "Gelb";
        }
        return result;
    }

    /**
     * Returns a String based on set values for contents of salt in comestible
     *
     * @return String
     */
    public String getAmpelSalz() {
        String result;
        if (this.getSalz() < 0.3) {
            result = "grün";
        } else if (this.getSalz() > 1.5) {
            result = "rot";
        } else {
            result = "Gelb";
        }
        return result;
    }
}
