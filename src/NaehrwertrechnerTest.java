public class NaehrwertrechnerTest {
    public static void main(String[] args){

        //array to save new Nahrungsmittel
        Nahrungsmittel[] Lebensmittel = new Nahrungsmittel[5];

        //filling array with new Nahrungsmittel using the constructor
        Lebensmittel[0] = new Nahrungsmittel("Nutella", 539, 30.9, 56.3, 0.107);

        Lebensmittel[1] = new Nahrungsmittel("Kiwi", 62, 0.6, 9, 0);

        Lebensmittel[2] = new Nahrungsmittel("Choco Fresh", 577, 42.7, 39.6, 0.153);

        Lebensmittel[3] = new Nahrungsmittel("Lachs Filet", 195, 9.4, 0, 0);

        Lebensmittel[4] = new Nahrungsmittel("Goldbären", 343, 0.5, 46, 0.07);

        for (Nahrungsmittel nahrungsmittel : Lebensmittel) {
            nahrungsmittel.info();
        }

    }
}
