public class Person {
    /**
     * Initialising variables for class
     */
    private double  energy, fat, sugar, salt;
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
     * @param amountInGram double for consumed amount
     */
    void konsumiere(Nahrungsmittel nahrung, double amountInGram){
        this.setEnergy(this.getEnergy() + ((nahrung.getEnergy()/100) * amountInGram));
        this.setFat(this.getFat() + ((nahrung.getFat()/100) * amountInGram));
        this.setSugar(this.getSugar() + ((nahrung.getSugar()/100) * amountInGram));
        this.setSalt(this.getSalt() + ((nahrung.getSalt()/100) * amountInGram));
    }

    /**
     * Method prints string for given person with amounts of consumed nutrients
     */
    void info(){
        System.out.println(this.getName() + " - Consumed Nutrients - Energy: " + this.getEnergy()
                + " kcal, Fat: " + this.getFat() + "g, Sugar: " + this.getSugar() + "g, Salt: " + this.getSalt()
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
    public double getEnergy() {
        return (double)Math.round(this.energy * 100) / 100;
    }

    /**
     * Setter for energy consumed by a person
     *
     * @param energy Energy a person has taken in through comestibles
     */
    public void setEnergy(double energy) {
        this.energy = energy;
    }

    /**
     * Getter for Fat value with integrated value
     *
     * @return double
     */
    public double getFat() {
        return (double)Math.round(this.fat * 100) / 100;
    }

    /**
     * Setter for fat consumed by a person
     *
     * @param fat Fat a person has taken in through comestibles
     */
    public void setFat(double fat) {
        this.fat = fat;
    }

    /**
     * Getter for sugar value with integrated value
     *
     * @return double
     */
    public double getSugar() {
        return (double)Math.round(this.sugar * 100) / 100;
    }

    /**
     * Setter for sugar consumed by a person
     *
     * @param sugar Sugar a person has taken in through comestibles
     */
    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    /**
     * Getter for salt value with integrated value
     *
     * @return double
     */
    public double getSalt() {
        return (double)Math.round(this.salt * 100) / 100;
    }

    /**
     * Setter for salt consumed by a person
     * @param salt Salt a person has taken in through comestibles
     */
    public void setSalt(double salt) {
        this.salt = salt;
    }
}
