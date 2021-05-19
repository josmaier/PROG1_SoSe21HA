public class Nahrungsmittel {
    /**
     * Initialising variables for class
     */
    private final double energy, fat, sugar, salt;
    private final String comestibleName;

    /**
     * Constructor for a new object of the class Nahrungsmittel
     *
     * @param comestibleName   String Name of comestible
     * @param energy           Double Energy value for comestible per 100g
     * @param fat              Double Fat value for comestible per 100g
     * @param sugar            Double Sugar value for comestible per 100g
     * @param salt             Double Salt value for comestible per 100g
     */
    public Nahrungsmittel(String comestibleName, double energy, double fat, double sugar, double salt) {
        this.comestibleName = comestibleName;
        this.energy          = energy;
        this.fat             = fat;
        this.sugar           = sugar;
        this.salt            = salt;
    }

    /**
     * Method prints string with information about given comestible
     */
    void info() {
        System.out.println(this.getComestibleName() + " - Energy: " + this.getEnergy() + " kcal, Fat: "
                + this.getFat() + "g (" + this.getLightFat() + ") , Sugar: " + this.getSugar() + "g ("
                + this.getLightSugar() + ") Salt: " + this.getSalt() + "g (" + this.getLightSalt() + ")");
    }

    /**
     * Getter for energy value
     *
     * @return double
     */
    public double getEnergy() {
        return this.energy;
    }

    /**
     * Getter for fat value
     *
     * @return double
     */
    public double getFat() {
        return this.fat;
    }

    /**
     * Getter for sugar value
     *
     * @return double
     */
    public double getSugar() {
        return this.sugar;
    }

    /**
     * Getter for salt value
     *
     * @return double
     */
    public double getSalt() {
        return this.salt;
    }

    /**
     * Setting get function for name
     *
     * @return String
     */
    public String getComestibleName() {
        return this.comestibleName;
    }

    /**
     * Returns a String based on set values for contents of fat in comestible
     *
     * @return String
     */
    public String getLightFat() {
        String result;
        if (this.getFat() < 3) {
            result = "green";
        } else if (this.getFat() > 17.5) {
            result = "red";
        } else {
            result = "yellow";
        }
        return result;
    }

    /**
     * Returns a String based on set values for contents of sugar in comestible
     *
     * @return String
     */
    public String getLightSugar() {
        String result;
        if (this.getSugar() < 5) {
            result = "green";
        } else if (this.getSugar() > 22.5) {
            result = "red";
        } else {
            result = "yellow";
        }
        return result;
    }

    /**
     * Returns a String based on set values for contents of salt in comestible
     *
     * @return String
     */
    public String getLightSalt() {
        String result;
        if (this.getSalt() < 0.3) {
            result = "green";
        } else if (this.getSalt() > 1.5) {
            result = "red";
        } else {
            result = "yellow";
        }
        return result;
    }
}
