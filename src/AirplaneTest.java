public class AirplaneTest {
    public static void main(String[] args) {

        Airplane    hans   = new Airplane("boeing", 400, 2);
        Biplane freddy = new Biplane(12343, "330", 2453);
        PassengerAirplane jonas  = new PassengerAirplane("freddie", 400, 2,
                "231785", 100);

        System.out.println("Can this airplane do a looping? " + jonas.getLooping());
        System.out.println("Can this airplane do a looping? " + freddy.getLooping());
        freddy.getOpenCockpit();

    }
}
