public class Main {

    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(10.0,25.0);
        complexNumber.add(complexNumber);
        System.out.println(complexNumber.getReal());
        System.out.println(complexNumber.getImaginary());
    }
}
