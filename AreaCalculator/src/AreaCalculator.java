public class AreaCalculator {

    public static final double PI = Math.PI;

    //Area of a circle
    public static double area (double radius){
        if(radius < 0){
            return -1.0;
        } else {
            return radius * radius * PI;
        }
    }

    //Area of a Rectangle
    public static double area (double x, double y){
        if(x < 0 || y < 0){
            return -1.0;
        } else {
            return x * y;
        }
    }
}
