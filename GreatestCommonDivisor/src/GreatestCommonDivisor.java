public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int num1, int num2){
        if (num1 < 10 || num2 < 10) {
            return -1;
        }
        while (num1 != num2) {
            if (num1 > num2)
                num1 -= num2;
            else {
                num2 -= num1;
            }
        }
        return num2;
    }
}
