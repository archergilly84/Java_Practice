public class SumOddRange {

    public static boolean isOdd (int number){
        if(number > 0 ){
            return number % 2 != 0;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if(start > end || start < 0 || end < 0){
            return -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) sum += i;
            }
            return sum;
        }
    }

}