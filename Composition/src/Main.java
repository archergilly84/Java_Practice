public class Main {

    public static void main(String[] args) {

        Bed bed = new Bed("King", 4, "MetalFramed");

        TV tv = new TV("LG", "Black", false);

        Bedroom bedroom = new Bedroom(tv,bed);
        bedroom.makeBed();
        bedroom.getTv().turnOn();

    }
}
