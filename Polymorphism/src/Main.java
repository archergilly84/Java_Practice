class Car {

    private String name;
    private boolean engine;
    private int wheels;
    private int cylinders;

    public Car(String name, int cylinders) {
        engine = true;
        wheels = 4;
        this.name = name;
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine(){
        System.out.println("Car -> Engine Started");
    }

    public void accelerate(){
        System.out.println("Car -> Start Moving");
    }

    public void brake(){
        System.out.println("Car -> Stop Moving");
    }
}

class Ford extends Car{

    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Ford -> Engine Started");
    }

    @Override
    public void accelerate() {
        System.out.println("Ford -> Start Moving");
    }

    @Override
    public void brake() {
        System.out.println("Ford -> Stop Moving");
    }
}

class Porsche extends Car{

    public Porsche(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Porsche -> Engine Started");
    }

    @Override
    public void accelerate() {
        System.out.println("Porsche -> Start Moving");
    }

    @Override
    public void brake() {
        System.out.println("Porsche -> Stop Moving");
    }
}

class Mitsibushi extends Car{

    public Mitsibushi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Mitsibushi -> Engine Started");
    }

    @Override
    public void accelerate() {
        System.out.println("Mitsibushi -> Start Moving");
    }

    @Override
    public void brake() {
        System.out.println("Mitsibushi -> Stop Moving");
    }
}

public class Main {


    public static void main(String[] args) {

        Car car = new Car("Base",8);
        car.startEngine();
        car.accelerate();
        car.brake();

        Ford ford = new Ford("Fiesta",8);
        ford.startEngine();
        ford.accelerate();
        ford.brake();

        Mitsibushi mitsibushi = new Mitsibushi("Fiesta",8);
        mitsibushi.startEngine();
        mitsibushi.accelerate();
        mitsibushi.brake();

    }
}


