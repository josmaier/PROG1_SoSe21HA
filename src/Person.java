public class Person {
    /**
     * Initialising variables for class
     */
    private double  energie, fett, zucker, salz;
    private final String name;

    /**
     * Constructor for new object of the class person
     *
     * @param name String name of the person
     */
    public Person(String name){
        this.name = name;
    }

    /**
     * Method for updating a persons consumed nutrients depending on consumed food and corresponding amount
     *
     * @param nahrung      Nahrungsmittel for name of consumed comestible
     * @param mengeInGramm double for consumed amount
     */
    void konsumiere(Nahrungsmittel nahrung, double mengeInGramm){
        this.setEnergie(this.getEnergie() + ((nahrung.getEnergie()/100) * mengeInGramm));
        this.setFett(this.getFett() + ((nahrung.getFett()/100) * mengeInGramm));
        this.setZucker(this.getZucker() + ((nahrung.getZucker()/100) * mengeInGramm));
        this.setSalz(this.getSalz() + ((nahrung.getSalz()/100) * mengeInGramm));
    }

    /**
     * Method prints string for given person with amounts of consumed nutrients
     */
    void info(){
        System.out.println(this.getName() + " - Aufgenommene Nährwerte - Energie: " + this.getEnergie()
                + " kcal, Fett: " + this.getFett() + "g, Zucker: " + this.getZucker() + "g, Salz: " + this.getSalz()
                + "g");
    }

    /**
     * Getter for name
     *
     * @return String
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for energy value with integrated value
     *
     * @return double
     */
    public double getEnergie() {
        return (double)Math.round(this.energie * 100) / 100;
    }

    /**
     * Setter for energy consumed by a person
     *
     * @param energie Energy a person has taken in through comestibles
     */
    public void setEnergie(double energie) {
        this.energie = energie;
    }

    /**
     * Getter for Fat value with integrated value
     *
     * @return double
     */
    public double getFett() {
        return (double)Math.round(this.fett * 100) / 100;
    }

    /**
     * Setter for fat consumed by a person
     *
     * @param fett Fat a person has taken in through comestibles
     */
    public void setFett(double fett) {
        this.fett = fett;
    }

    /**
     * Getter for sugar value with integrated value
     *
     * @return double
     */
    public double getZucker() {
        return (double)Math.round(this.zucker * 100) / 100;
    }

    /**
     * Setter for sugar consumed by a person
     *
     * @param zucker Sugar a person has taken in through comestibles
     */
    public void setZucker(double zucker) {
        this.zucker = zucker;
    }

    /**
     * Getter for salt value with integrated value
     *
     * @return double
     */
    public double getSalz() {
        return (double)Math.round(this.salz * 100) / 100;
    }

    /**
     * Setter for salt consumed by a person
     * @param salz Salt a person has taken in through comestibles
     */
    public void setSalz(double salz) {
        this.salz = salz;
    }
}
