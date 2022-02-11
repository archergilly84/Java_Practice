public class LastDigitChecker {
    public static boolean hasSameLastDigit (int num1, int num2, int num3) {
        if (isValid(num1) && isValid(num2) && isValid(num3)) {
            if (num1 % 10 == num2 % 10 || num2 % 10 == num3 % 10 || num1 % 10 == num3 % 10)
                return true;
            else
                return false;
        } else {
            return false;
        }
    }

    public static boolean isValid (int number){
        return number >= 10 && number <= 1000;
    }
}
