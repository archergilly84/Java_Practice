public class SecondsAndMinutes {


    public static final String INVALID_VALUE = "Invalid Value";

    public static String getDurationString (int min, int secs){
        if(min >= 0 || (secs >= 0 || secs <= 59)) {
            int hours = min / 60;
            int remainingMinutes = min % 60;
            return hours + "h " + remainingMinutes + "m " + secs + "s";
        } else {
            return INVALID_VALUE;
        }
    }

    public static String getDurationString(int secs){
        if(secs >= 0){
            int minutes = secs / 60;
            int remainingSeconds = secs % 60;
            return getDurationString(minutes,remainingSeconds);
        } else {
            return INVALID_VALUE;
        }
    }
}
