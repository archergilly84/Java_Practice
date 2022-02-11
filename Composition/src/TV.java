public class TV {

    private String make;
    private String colour;
    private boolean isMounted;


    public TV (String make, String colour, boolean isMounted) {
        this.make = make;
        this.colour = colour;
        this.isMounted = isMounted;
    }

    public String getMake() {
        return make;
    }

    public String getColour() {
        return colour;
    }

    public boolean isMounted() {
        return isMounted;
    }

    public void turnOn(){
        System.out.println("TV is powering on...");
    }
}
