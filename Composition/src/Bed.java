public class Bed {

    private String size;
    private int pillows;
    private String type;

    public Bed(String size, int pillows, String type) {
        this.size = size;
        this.pillows = pillows;
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public int getPillows() {
        return pillows;
    }

    public String getType() {
        return type;
    }

    public void make(){
        System.out.println("Making");
    }
}
