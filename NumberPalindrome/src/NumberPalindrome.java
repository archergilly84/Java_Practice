public class NumberPalindrome {

    public static boolean isPalindrome(int number){

        int lastDigit;
        int reverse = 0;
        int num = number;

        while(num != 0) {
            lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }
        return number == reverse;
    }
}
