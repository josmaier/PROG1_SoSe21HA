public class NaehrwertrechnerTest {
    /**
     * this program tests mehtods from the classes Lebensmittel and Person
     */
    public static void main(String[] args) {

        /*
          Array for saving objects of class Lebensmittel
         */
        Nahrungsmittel[] lebensmittel = new Nahrungsmittel[5];

        /*
         Creating objects of class Lebensmittel using the constructor
         */
        lebensmittel[0] = new Nahrungsmittel("Nutella", 539, 30.9, 56.3, 0.107);
        lebensmittel[1] = new Nahrungsmittel("Kiwi", 62, 0.6, 9, 0);
        lebensmittel[2] = new Nahrungsmittel("Choco Fresh", 577, 42.7, 39.6, 0.153);
        lebensmittel[3] = new Nahrungsmittel("Lachs Filet", 195, 9.4, 0, 0);
        lebensmittel[4] = new Nahrungsmittel("Goldbären", 343, 0.5, 46, 0.07);

        /*
        Outputting String with information for each object
         */
        for (Nahrungsmittel nahrungsmittel : lebensmittel) {
            nahrungsmittel.info();
        }

        /*
        inserting empty line for readability
         */
        System.out.println();

        /*
          Array for saving objects of class Person
         */
        Person[] personen = new Person[2];

        /*
         Creating objects of class Person using the constructor
         */
        personen[0] = new Person("Stefan");
        personen[1] = new Person("Etlam");

        /*
        Testing consume method from class Person
         */
        personen[0].konsumiere(lebensmittel[1], 1500);
        personen[0].konsumiere(lebensmittel[0], 300);
        personen[1].konsumiere(lebensmittel[4], 1000);
        personen[1].konsumiere(lebensmittel[2], 50);

        /*
        Outputting String with information about each object
         */
        personen[0].info();
        personen[1].info();
    }
}
