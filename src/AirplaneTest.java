public class AirplaneTest {
    public static void main(String[] args) {

        Airplane    hans   = new Airplane("boeing", 400, 2);
        Biplane freddy = new Biplane(12343, "Boeing", 300);
        Biplane ferdinant = new Biplane("Freddy", 500, 1253213, false);
        PassengerAirplane jonas  = new PassengerAirplane("freddie", 400, 2,
                "231785", 100);

        System.out.println("Can this airplane do a looping? " + jonas.getLooping());
        freddy.getOpenCockpit();
        ferdinant.getOpenCockpit();
        ferdinant.getLooping();
        freddy.getLooping();
        System.out.println("Can this airplane do a looping? " + ferdinant.getLooping());
        System.out.println("Can this airplane do a looping? " + freddy.getLooping());

    }
}
