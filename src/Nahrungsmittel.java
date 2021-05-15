public class Nahrungsmittel {
    //intialising variables
    private double energie, fett, zucker, salz;

    private final String lebensmittelName;
    private String ampelFett;
    private String ampelZucker;
    private String ampelSalz;

    //constructor for setting variables
    public Nahrungsmittel(String lebensmittelName, double energie, double fett, double zucker, double salz) {
        this.lebensmittelName = lebensmittelName;
        this.energie = energie;
        this.fett = fett;
        this.zucker = zucker;
        this.salz = salz;

    }

    //functions for setting Lebensmittelampel for each parameter
    String ampelbestimmungFett(){
        if (fett < 3){
            return "grün";
        }
        else if (fett > 17.5){
            return "rot";
        }
        else{
            return  "Gelb";
        }
    }
    String ampelbestimmungZucker(){
        if (zucker < 5){
            return "grün";
        }
        else if (zucker > 22.5){
            return "rot";
        }
        else{
            return "gelb";
        }
    }
    String ampelbestimmungSalz(){
        if (salz < 0.3){
            return "grün";
        }
        else if (salz > 1.5){
            return "rot";
        }
        else{
            return "Gelb";
        }
    }

    //function for returning information about as a string
    void info(){
        System.out.println(lebensmittelName + " - Energie: " + energie + " kcal, Fett: " + fett + "g (" + this.ampelbestimmungFett() + ") , Zucker: " + zucker + "g (" + this.ampelbestimmungZucker()
                + ") Salz: " + salz + "g (" + this.ampelbestimmungSalz() + ")");
    }

    //setting get functions for variables

    public double getEnergie(){
        return energie;
    }

    public double getFett(){
        return fett;
    }

    public double getZucker(){
        return zucker;
    }

    public double getSalz(){
        return salz;
    }

    public String getLebensmittelName(){
        return lebensmittelName;
    }

    public String getAmpelFett(){
        return ampelFett;
    }

    public String getAmpelZucker(){
        return ampelZucker;
    }

    public String getAmpelSalz(){
        return ampelSalz;
    }
}
