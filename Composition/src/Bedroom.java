public class Bedroom {

    private TV tv;
    private Bed bed;

    public Bedroom(TV tv, Bed bed) {
        this.tv = tv;
        this.bed = bed;
    }

    public TV getTv(){
        return this.tv;
    }

    public void makeBed(){
        System.out.println("Making the bed");
        bed.make();
    }

}
